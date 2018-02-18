package com.fisepn.polimuseo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {

    private Button btn_tourvirtual;
    private ZXingScannerView vistaescaner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tourvirtual = findViewById(R.id.btn_tourvirtual);
        btn_tourvirtual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TourVirtual.class);
                startActivity(intent);
            }
        });
    }

    public  void Escanear (View view)
    {
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
            setContentView(R.layout.activity_main);
            vistaescaner.stopCamera();


            Uri uri = Uri.parse(dato);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }

    public void goInfoMuseo(View view) {
        Intent intent = new Intent(this, InfoMuseoActivity.class);
        startActivity(intent);
    }


}


