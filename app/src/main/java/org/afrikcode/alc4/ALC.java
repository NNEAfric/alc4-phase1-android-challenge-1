package org.afrikcode.alc4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ALC extends AppCompatActivity {

    WebView wv_alc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About ALC");
        actionBar.setElevation(0);

        wv_alc = (WebView) findViewById(R.id.wv_alc);

        wv_alc.getSettings().setJavaScriptEnabled(true);
        wv_alc.getSettings().setLoadWithOverviewMode(true);
        wv_alc.getSettings().setUseWideViewPort(true);
        wv_alc.setWebViewClient(new WebViewClient(){

            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }

        });

        wv_alc.loadUrl("https://andela.com/alc/");
    }

}
