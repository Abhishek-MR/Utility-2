package com.example.abhi.utility;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.TextureView;
import android.view.WindowManager;

public class MirrorAct extends Activity implements TextureView.SurfaceTextureListener {
    private Camera mCamera;
    private TextureView mTextureView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.animator.left_in, R.animator.left_out);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        mTextureView = new TextureView(this);
        mTextureView.setSurfaceTextureListener(this);
        setContentView(mTextureView);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        Camera.CameraInfo info = new Camera.CameraInfo();
        int i;
        int n = Camera.getNumberOfCameras();
        for (i = 0; i < n; ++i) {
            Camera.getCameraInfo(i, info);
            if (info.facing == Camera.CameraInfo.CAMERA_FACING_FRONT) {
                break;
            }
        }

        try {
            mCamera = Camera.open(i);
            mCamera.setPreviewTexture(surface);
        } catch (Exception e) {
            return;
        }

        Camera.Parameters parameters = mCamera.getParameters();
        if (parameters == null) {
            return;
        }

        Camera.Size previewSize = parameters.getSupportedPreviewSizes().get(0);
        if (previewSize == null) {
            return;
        }

        parameters.setPreviewSize(previewSize.width, previewSize.height);
        mCamera.setParameters(parameters);


        double ratioSurface = (double)width / height;
        double ratioPreview = (double)previewSize.height / previewSize.width;

        float scaleX = 1f;
        float scaleY = 1f;
        if (ratioSurface > ratioPreview) {
            scaleY = (float)(ratioSurface / ratioPreview);
        } else {
            scaleX = (float)(ratioPreview / ratioSurface);
        }
        int moveX = (int)((1f - scaleX) * width  / 2);
        int moveY = (int)((1f - scaleY) * height / 2);

        Matrix matrix = new Matrix();
        matrix.setScale(scaleX, scaleY);
        matrix.postTranslate(moveX, moveY);
        mTextureView.setTransform(matrix);

        mCamera.setDisplayOrientation(90);
        mCamera.startPreview();
    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        if (mCamera != null) {
            mCamera.stopPreview();
            mCamera.release();
        }
        return true;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.right_in, R.animator.right_out);
    }
}
