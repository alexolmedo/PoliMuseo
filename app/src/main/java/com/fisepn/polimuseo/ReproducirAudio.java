package com.fisepn.polimuseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class ReproducirAudio extends AppCompatActivity {

    private WebView webViewAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproducir_audio);

        Intent intent = getIntent();
        String urlAudio = intent.getStringExtra(EscanerAudioguia.URL_AUDIO);

        webViewAudio = findViewById(R.id.webviewAudio);
        webViewAudio.getSettings().setJavaScriptEnabled(true);
        webViewAudio.getSettings().setAllowFileAccessFromFileURLs(true);
        webViewAudio.loadUrl(urlAudio);
    }

//    @Override
//    public void onBackPressed() {
//        moveTaskToBack(true);
//    }
}
