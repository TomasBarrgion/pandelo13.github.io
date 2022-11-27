package com.example.fulboenums;

public class Futbolista {

    private int dorsal;
    private String Nombre;
    private Demarcacion demarcacion;
    private Equipo equipo;



    public Futbolista(int dorsal, String nombre, Demarcacion demarcacion, Equipo equipo) {
        this.dorsal = dorsal;
        Nombre = nombre;
        this.demarcacion = demarcacion;
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", Nombre='" + Nombre + '\'' +
                ", demarcacion=" + demarcacion +
                ", equipo=" + equipo +
                '}';
    }
}
