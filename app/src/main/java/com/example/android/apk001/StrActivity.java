package com.example.android.apk001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class StrActivity extends AppCompatActivity {

    WebView webwiew1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_str);

        webwiew1= (WebView)findViewById(R.id.webView1);
        webwiew1.getSettings().setJavaScriptEnabled(true);
        webwiew1.loadUrl("file:///android_asset/strona.html");
    }
}
