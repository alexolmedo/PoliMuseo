package com.fisepn.polimuseo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TourVirtual extends AppCompatActivity {

    private WebView webViewTour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_virtual);
        webViewTour = findViewById(R.id.webviewTour);
        webViewTour.getSettings().setJavaScriptEnabled(true);
        webViewTour.getSettings().setLoadsImagesAutomatically(true);
        //webViewTour.getSettings().setAllowFileAccessFromFileURLs(true);
        webViewTour.loadUrl("http://www.marzipano.net/demos/sample-tour/index.html");
    }
}
