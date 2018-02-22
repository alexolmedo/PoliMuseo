package com.fisepn.polimuseo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class InfoMuseoActivity extends AppCompatActivity {

    private ListView lstView;
    private ArrayList<String> listViewItems = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_museo);
        cargarLista();
        mostrarActivity();
    }

    public void cargarLista(){

        lstView = (ListView)findViewById(R.id.listViewInfo);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,listViewItems);
        lstView.setAdapter(adapter);
        adapter.add("Historia");
        adapter.add("Mapa de áreas");
        adapter.add("Dirección");
        adapter.add("Contacto");
        adapter.notifyDataSetChanged();
    }

    public void mostrarActivity() {
        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),"Clic en el item numero " +
                        position, Toast.LENGTH_LONG).show();

                if (position == 0)  {
                    mostrarHistoria();
                } else if (position == 1) {
                    mostrarMapaAreas();
                } else if (position == 2) {
                    mostrarDireccion();
                } else if (position == 3) {
                    mostrarContacto();
                }
            }
        });
    }

    public void mostrarMapaAreas() {
        Intent intent = new Intent(this, MapaAreasInfoActivity.class);
        startActivity(intent);
    }
    public void mostrarContacto() {
        Intent intent = new Intent(this, ContactoActivity.class);
        startActivity(intent);
    }

    public void mostrarDireccion() {
        Intent intent = new Intent(this, DireccionActivity.class);
        startActivity(intent);
    }

    public void mostrarHistoria() {
        Intent intent = new Intent(this, HistoriaInfoActivity.class);
        startActivity(intent);
    }
}

