package com.example.salento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //Definición de Atributos
    ImageView fotohotel1,foto2hotel1,foto3hotel1,fotohotel2,foto2hotel2,foto3hotel2;
    TextView nombreHotel1,nombreHotel2,descripcion1,descripcion2;

    Hoteles hotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreHotel1=findViewById(R.id.nombreHotel1);
        nombreHotel2=findViewById(R.id.nombreHotel2);
        descripcion1=findViewById(R.id.descripcion1);
        descripcion2=findViewById(R.id.descripcion2);
        fotohotel1=findViewById(R.id.fotohotel1);
        foto2hotel1=findViewById(R.id.foto2hotel1);
        foto3hotel1=findViewById(R.id.foto3hotel1);
        fotohotel2=findViewById(R.id.fotohotel2);
        foto2hotel2=findViewById(R.id.foto2hotel2);
        foto3hotel2=findViewById(R.id.foto3hotel2);

        hotel =(Hoteles)getIntent().getSerializableExtra("hoteles");
    }
}