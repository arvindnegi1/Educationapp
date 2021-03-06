package com.hungrymind.classes;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
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
        pd.setMessage("Loding");
        pd.show();
        Intent intent=getIntent();
        String indexurl=intent.getStringExtra("indexurl");
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        webView.loadUrl(indexurl);
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
        public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
            if(url.equals("https://hungrymindclasses.com/")) {
                Intent intent=new Intent(Reference.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                pd.dismiss();
                startActivity(intent);
                finish();
            }
            super.doUpdateVisitedHistory(view, url, isReload);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            if(pd.isShowing())
                pd.dismiss();
        }
    }
}
