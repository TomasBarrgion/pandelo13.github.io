package com.example.repasoej1;

import java.text.DateFormat;
import java.util.Date;

public class Autor extends Persona{
    private String nacionalidad;


    public Autor(String nombre, String apellido, String nacionalidad) {
        super(nombre, apellido);
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
