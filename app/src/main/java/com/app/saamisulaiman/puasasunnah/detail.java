package com.app.saamisulaiman.puasasunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class detail extends AppCompatActivity {

    WebView webnya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        webnya = findViewById(R.id.webnya);

        Intent detail = getIntent();
        detail.getIntExtra("posisi", 0);
        String link = detail.getStringExtra("link");

        webnya.getSettings().setJavaScriptEnabled(true);
        webnya.loadUrl(link);

    }
}
