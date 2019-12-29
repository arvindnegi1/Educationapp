package com.negi.hungrymindclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Reference extends AppCompatActivity {
WebView webView;
ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reference);
        webView=findViewById(R.id.referencelink);
        webView.setWebViewClient(new MyBrowser());
        webView.getSettings().setJavaScriptEnabled(true);
        pd=new ProgressDialog(Reference.this);
        pd.setMessage("PLEASE WAIT LOADING");
        pd.show();
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.loadUrl("http://hungrymindclasses.com/");
    }
    private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            if(!pd.isShowing())
                pd.show();
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            if(pd.isShowing())
                pd.dismiss();
        }
    }
}
