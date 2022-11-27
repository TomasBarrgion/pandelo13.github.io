package com.example.repasoej1;

import java.util.ArrayList;

public class Album {
    private String titulo;
    private ArrayList<Cancion> canciones = new ArrayList<>();

    public Album(String titulo, ArrayList<Cancion> canciones) {
        this.titulo = titulo;
        this.canciones = canciones;
    }

    public Album(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    //Debe existir un método que devuelva el listado completo artistas que participaron en
    //un álbum y otro que devuelva el artista más influyente (con más canciones) de un
    //álbum.

    public void participantes(){
        for(int i=0; i<canciones.size();i++){
            System.out.println(canciones.get(i).getArtistas());
        }
    }


   public int cantApariciones(Artista artista){
        int cant=0;
        for(int i=0; i<canciones.size(); i++){
            for(int j=0; j<canciones.get(i).getArtistas().size(); j++){
            if ((canciones.get(i).getArtistas().get(j).getNombre()) == artista.getNombre()){
                cant++;
            }
        }
        }
       // System.out.println(cant);
        return cant;
    }

    public String masinfluyente(){
        int masinfluyentenumero = 0;
        String masinfluyente = "";
        Artista artistaactual;
        for(int i=0; i<canciones.size(); i++){
            for(int j=0; j<canciones.get(i).getArtistas().size(); j++){
               artistaactual = canciones.get(i).getArtistas().get(j);
               if (cantApariciones(artistaactual) > masinfluyentenumero){
                   masinfluyentenumero = cantApariciones(artistaactual);
                   masinfluyente = artistaactual.getNombre();
               }
            }
        }
        return masinfluyente;
    }


    //Debe existir un método que devuelva un listado completo de canciones escritas por
    //autores de una nacionalidad ingresada.


    public void delanacionalidad(String nacionalidad){
        ArrayList<String> delpais = new ArrayList<>();
        for(int i=0; i<canciones.size(); i++){
            for(int j=0; j<canciones.get(i).getAutores().size(); j++){
                if (canciones.get(i).getAutores().get(j).getNacionalidad() == nacionalidad){
                    delpais.add(canciones.get(i).getAutores().get(j).getNombre());
            }
        }
        }
        for (int i=0; i<delpais.size();i++){
            System.out.println(delpais.get(i));
        }
    }











    @Override
    public String toString() {
        return "Album{" +
                "titulo='" + titulo + '\'' +
                ", canciones=" + canciones +
                '}';
    }
}
