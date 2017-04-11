package com.example.abhi.utility;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Scanner extends AppCompatActivity {
    private TextView text;

    // QREader
    private SurfaceView mySurfaceView;
    private QREader qrEader;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        text = (TextView) findViewById(R.id.code_info);

        final Button stateBtn = (Button) findViewById(R.id.btn_start_stop);
        // change of reader state in dynamic
        stateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qrEader.isCameraRunning()) {
                    stateBtn.setText("Start QREader");
                    qrEader.stop();
                }
                else {
                    stateBtn.setText("Stop QREader");
                    qrEader.start();
                }
            }
        });

        stateBtn.setVisibility(View.VISIBLE);


        // Setup SurfaceView
        // -----------------
        mySurfaceView = (SurfaceView) findViewById(R.id.camera_view);

        // Init QREader
        // ------------
        qrEader = new QREader.Builder(this, mySurfaceView, new QRDataListener() {
            @Override
            public void onDetected(final String data) {
                Log.d("QREader", "Value : " + data);
                text.post(new Runnable() {
                    @Override
                    public void run() {
                        text.setText(data);
                    }
                });
            }
        }).facing(QREader.BACK_CAM)
                .enableAutofocus(true)
                .height(mySurfaceView.getHeight())
                .width(mySurfaceView.getWidth())
                .build();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Init and Start with SurfaceView
        // -------------------------------
        qrEader.initAndStart(mySurfaceView);
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Cleanup in onPause()
        // --------------------
        qrEader.releaseAndCleanup();
    }
}
