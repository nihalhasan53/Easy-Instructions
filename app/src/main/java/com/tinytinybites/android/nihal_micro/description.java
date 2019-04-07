package com.tinytinybites.android.nihal_micro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        TextView title=(TextView)findViewById(R.id.title);
        TextView matter=(TextView)findViewById(R.id.matter);
        WebView link=(WebView)findViewById(R.id.link) ;
        title.setText(getIntent().getExtras().getString("Introduction"));
        matter.setText(getIntent().getExtras().getString("Matter"));
        link.getSettings().setJavaScriptEnabled(true);
        link.setWebViewClient(new WebViewClient());
        link.loadUrl(getIntent().getExtras().getString("link"));

    }
}


