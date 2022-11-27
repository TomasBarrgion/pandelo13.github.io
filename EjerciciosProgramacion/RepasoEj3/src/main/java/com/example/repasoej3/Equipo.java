package com.example.repasoej3;

import java.util.ArrayList;
import java.util.HashMap;

public class Equipo {
    private String nombre;
    private String barrio;
    private ArrayList<Jugador> jugadores;
    //ArrayList<Diadelasemana> disponibilidad = new ArrayList<>();
    private HashMap<Diadelasemana, ArrayList<Horario>> disponibilidad;



    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", barrio='" + barrio + '\'' +
                ", jugadores=" + jugadores +
                ", disponibilidad=" + disponibilidad +
                '}';
    }

    public Equipo(String nombre, String barrio) {
        this.nombre = nombre;
        this.barrio = barrio;
        this.jugadores = new ArrayList<>();
        this.disponibilidad = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public HashMap<Diadelasemana, ArrayList<Horario>> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(HashMap<Diadelasemana, ArrayList<Horario>> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}