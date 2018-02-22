package com.fisepn.polimuseo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DireccionActivity extends AppCompatActivity {

    private ListView lstView;
    private ArrayList<String> listViewItems = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);
    }

    public void cargarLista(){

        lstView = (ListView)findViewById(R.id.listViewInfo);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,listViewItems);
        lstView.setAdapter(adapter);
        adapter.add("Dirección:\tSector Floresta - Av. Ladrón de Guevara E11-253 y Andalucía (frente al Coliseo Rumiñahui)");
        adapter.add("Horario de Atención:\t8:00 am - 16:30 pm");
        adapter.notifyDataSetChanged();
    }
}
