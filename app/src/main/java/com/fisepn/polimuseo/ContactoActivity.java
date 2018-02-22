package com.fisepn.polimuseo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ContactoActivity extends AppCompatActivity {

    private ListView lstView;
    private ArrayList<String> listViewItems = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        cargarLista();

    }

    public void cargarLista(){

        lstView = (ListView)findViewById(R.id.listViewContacto);
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,listViewItems);
        lstView.setAdapter(adapter);
        adapter.add("Telefono:\t250 7144 \n ext. 2250 / 223 6690");
        adapter.add("E-mail:\tmuseo@epn.edu.ec");
        adapter.add("Facebook:\tMuseo de Historia Natural \"Gustavo Orcés V\".");
        adapter.add("Youtube:\tEPN Ecuador");
        adapter.notifyDataSetChanged();
    }
}
