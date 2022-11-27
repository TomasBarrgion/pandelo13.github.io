package com.example.repasoej1;

import java.util.ArrayList;
import java.util.Date;

public class SistemaAlbumes {
    //Realizar un sistema que administre un listado de álbumes. Cada álbum tiene un
    //título y una lista de canciones. Cada canción tiene como dato un título, una lista de
    //artistas y una lista de autores.
    //Los artistas y los autores son personas de las cuales se almacena su nombre,
    //apellido y fecha de nacimiento. Para los autores se debe almacenar su nacionalidad.
    //Debe existir un método que devuelva el listado completo artistas que participaron en
    //un álbum y otro que devuelva el artista más influyente (con más canciones) de un
    //álbum.
    //Debe existir un método que devuelva un listado completo de canciones escritas por
    //autores de una nacionalidad ingresada.
    public static void main(String[] args) {

        //ALBUMES
        Album oscuroextasis = new Album("OscuroExtasis");

        //CANCIONES
        Cancion okupa = new Cancion("Okupa");
        Cancion segundacancion = new Cancion("Pepsicola");

        //AUTORES
        Autor Evlay = new Autor("Facundo","Yalve","Argentina");
        Autor Pepsi = new Autor("Pepsi","Yalve","Perú");
        Autor Coca = new Autor("Coca","Yalve","Argentina");
        Autor Steam = new Autor("Steam","Yalve","Argentina");

        //ARTISTAS
        Artista Wos = new Artista("Valentin","Oliva");
        Artista NickiNicole = new Artista("Nicki","Nicole");
        Artista Ricardo = new Artista("Ricardo","Mollo");
        Artista Elcolo = new Artista("Alejo","Mercuri");
        oscuroextasis.getCanciones().add(okupa);
        oscuroextasis.getCanciones().add(segundacancion);
        segundacancion.getAutores().add(Pepsi);
        segundacancion.getAutores().add(Coca);
        segundacancion.getAutores().add(Steam);
        okupa.getAutores().add(Evlay);
        okupa.getArtistas().add(Wos);
        okupa.getArtistas().add(NickiNicole);
        okupa.getArtistas().add(Ricardo);
        segundacancion.getArtistas().add(Wos);
        segundacancion.getArtistas().add(Elcolo);
        oscuroextasis.participantes();
        oscuroextasis.cantApariciones(Wos);
        System.out.println(oscuroextasis.masinfluyente());
        oscuroextasis.delanacionalidad("Argentina");
    }
}