package com.example.repasoej3;

import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.LocalDate;
import java.util.Date;

public class Jugador {
    String nombre;
    int numerocamiseta;
    boolean capitan;

    public Jugador(String nombre, int numerocamiseta, boolean capitan) {
        this.nombre = nombre;
        this.numerocamiseta = numerocamiseta;
        this.capitan = capitan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNumerocamiseta() {
        return numerocamiseta;
    }

    public void setNumerocamiseta(int numerocamiseta) {
        this.numerocamiseta = numerocamiseta;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", numerocamiseta=" + numerocamiseta +
                ", capitan=" + capitan +
                '}';
    }
}
