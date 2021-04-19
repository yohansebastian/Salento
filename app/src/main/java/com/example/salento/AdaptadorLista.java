package com.example.salento;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder> {

    ArrayList<Hoteles> listaDeDatos;

    public AdaptadorLista(ArrayList<Hoteles> listaDeDatos) {
        this.listaDeDatos = listaDeDatos;
    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaListado = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_de_lista,parent,false);
        return new viewHolder(vistaListado);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {
        holder.actualizarDatosDeItem(listaDeDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreHotel;
        ImageView fotoHotel;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreHotel = itemView.findViewById(R.id.dato1DelItemDelLista);
            fotoHotel = itemView.findViewById(R.id.hotelesSalento);
        }

        public void actualizarDatosDeItem(Hoteles datos) {

            nombreHotel.setText(datos.getNombreHotel());
            fotoHotel.setImageResource(datos.getFotoHotel());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("hoteles",datos);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}


