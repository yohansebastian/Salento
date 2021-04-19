package com.example.salento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {


    ArrayList<Hoteles> ListaDeDatos = new ArrayList<>();
    RecyclerView listado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listado = findViewById(R.id.listado);
        listado.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        crearListado();
        AdaptadorLista adaptador=new AdaptadorLista(ListaDeDatos);
        listado.setAdapter(adaptador);
    }

    private void crearListado() {
        ListaDeDatos.add(new Hoteles("Hoteles Disponibles",getString(R.string.descripcionHoteles),R.drawable.hotelsalento));
        ListaDeDatos.add(new Hoteles("Comidas Tipicas",getString(R.string.descripcionComida),R.drawable.comidas));
        ListaDeDatos.add(new Hoteles("Lugares Turisticos",getString(R.string.descripcionTurismo),R.drawable.turismo));
    }
}