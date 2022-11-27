package com.example.repasoej1;

import java.util.ArrayList;

public class Cancion{
    private String titulo;
    private ArrayList<Autor> autores = new ArrayList<>();
    private ArrayList<Artista> artistas = new ArrayList<>();

    public Cancion(String titulo) {
        this.titulo = titulo;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", autores=" + autores +
                ", artistas=" + artistas +
                '}';
    }
}
