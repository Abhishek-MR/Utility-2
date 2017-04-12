package com.example.abhi.utility;

import android.content.DialogInterface;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.GeolocationPermissions;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView mainWebView;
    SwipeRefreshLayout swipeLayout;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        overridePendingTransition(R.animator.left_in, R.animator.left_out);


        String data = getIntent().getExtras().getString("website");
        String website = "http://www.google.com";


        swipeLayout = (SwipeRefreshLayout) findViewById(R.id.swipeLayout);
        mainWebView = (WebView) findViewById(R.id.webView1);

        WebSettings webSettings = mainWebView.getSettings();
        mainWebView.setWebChromeClient(new GeoWebChromeClient());
        webSettings.setJavaScriptEnabled(true);
        mainWebView.getSettings().setGeolocationEnabled(true);
        mainWebView.setWebViewClient(new MyCustomWebViewClient());
        mainWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

        mainWebView.setWebViewClient(new WebViewClient() {

            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                swipeLayout.setRefreshing(false);
            }
        });


        swipeLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mainWebView.reload();
                swipeLayout.setRefreshing(true);
            }
        });

        switch (data){
            case "lp" : data = "pi";
            case "fb" : website = "http://www.facebook.com"; break;
            case "tw" : website = "https://twitter.com/login"; break;
            case "in" : website = "https://www.instagram.com/accounts/login/"; break;
            case "ln" : website = "https://in.linkedin.com/"; break;
            case "qu" : website = "https://www.quora.com/"; break;
            case "hi" : website = "http://www.thehindu.com/news/"; break;
            case "do" : website = "https://www.practo.com/"; break;
            case "ub" : website = "https://m.uber.com/"; break;
            case "ho" : website = "https://www.oyorooms.com/"; break;
            case "flp" :website = "http://m.silvergames.com/en/flappy-bird"; break;
            case "st" : website = "http://m.silvergames.com/en/stack-tower"; break;
            case "20" : website = "http://m.silvergames.com/en/2048"; break;
            case "rb" : website = "https://m.redbus.in"; break;
            case "ab" : website = "https://www.abhibus.com/mobile/"; break;
            case "ol" : website = "https://www.olacabs.com/"; break;
            case "ga" : website = "gaana.com"; break;
            case "wy" : website = "https://music.wynk.in/music/index.html"; break;
            case "toi" : website = "http://timesofindia.indiatimes.com/"; break;
            case "fn" : website = "http://www.silvergames.com/fruit-slice"; break;
            case "cu" : website = "http://www.silvergames.com/cut-the-rope-experiments"; break;
            case "gp" : website = "https://plus.google.com/"; break;
            case "my" : website = "https://myspace.com/"; break;
            case "te" : website = "https://web.telegram.org/#/login"; break;

            default: break;
        }
        mainWebView.loadUrl(website);
    }

    public class GeoWebChromeClient extends WebChromeClient {
        private static final String TAG = "MyActivity";
        @Override
        public void onGeolocationPermissionsShowPrompt(final String origin, final GeolocationPermissions.Callback callback) {
            Log.i(TAG, "onGeolocationPermissionsShowPrompt()");

            final boolean remember = false;
            AlertDialog.Builder builder = new AlertDialog.Builder(WebActivity.this);
            builder.setTitle("Locations Permission");
            builder.setMessage("Would like to use your Current Location ")
                    .setCancelable(true).setPositiveButton("Allow", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // origin, allow, remember
                    callback.invoke(origin, true, remember);
                }
            }).setNegativeButton("Don't Allow", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    // origin, allow, remember
                    callback.invoke(origin, false, remember);
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
        }
    }

    /*private ViewTreeObserver.OnScrollChangedListener mOnScrollChangedListener;

    @Override
    public void onStart() {
        super.onStart();

        swipeLayout.getViewTreeObserver().addOnScrollChangedListener(mOnScrollChangedListener =
                new ViewTreeObserver.OnScrollChangedListener() {
                    @Override
                    public void onScrollChanged() {
                        if (mainWebView.getScrollY() == 0)
                            swipeLayout.setEnabled(true);
                        else
                            swipeLayout.setEnabled(false);

                    }
                });
    }

    @Override
    public void onStop() {
        swipeLayout.getViewTreeObserver().removeOnScrollChangedListener(mOnScrollChangedListener);
        super.onStop();
    }

*/



    private class MyCustomWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }




    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mainWebView.canGoBack()) {
                        mainWebView.goBack();
                    } else {
                        onBackPressed();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.right_in, R.animator.right_out);
    }




}