package com.fisepn.polimuseo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.zxing.Result;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class EscanerAudioguia extends AppCompatActivity {

    private ZXingScannerView vistaescaner;
    public static final String URL_AUDIO = "url_audio";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vistaescaner = new ZXingScannerView(this);
        vistaescaner.setResultHandler( new xzingscanner());
        setContentView(vistaescaner);
        vistaescaner.startCamera();
    }

    class xzingscanner implements ZXingScannerView.ResultHandler
    {
        @Override
        public void handleResult(Result result) {
            String dato = result.getText();
            //vistaescaner.stopCamera();
            Intent intent = new Intent(getApplicationContext(), ReproducirAudio.class);
            intent.putExtra(URL_AUDIO,dato);
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
