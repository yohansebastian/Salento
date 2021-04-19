package com.example.salento;

import java.io.Serializable;

public class Hoteles implements Serializable {
    String nombreHotel,descripcion;
    int fotoHotel;

    public Hoteles(String nombreHotel,String descripcion, int fotoHotel) {
        this.nombreHotel = nombreHotel;
        this.fotoHotel = fotoHotel;
        this.descripcion = descripcion;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getFotoHotel() {
        return fotoHotel;
    }

    public void setFotoHotel(int fotoHotel) {
        this.fotoHotel = fotoHotel;
    }
}
