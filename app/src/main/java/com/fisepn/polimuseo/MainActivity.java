package com.fisepn.polimuseo;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_tourvirtual;

    private static final int MY_PERMISSION_REQUEST_CAMERA = 0;

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
        //Verifica si se tiene el permiso de camara
        if (ContextCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED){
            Intent intent = new Intent(getApplicationContext(), EscanerAudioguia.class);
            startActivity(intent);
        } else {
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CAMERA}, MY_PERMISSION_REQUEST_CAMERA);
        }
    }

    public void goInfoMuseo(View view) {
        Intent intent = new Intent(this, InfoMuseoActivity.class);
        startActivity(intent);
    }


}


