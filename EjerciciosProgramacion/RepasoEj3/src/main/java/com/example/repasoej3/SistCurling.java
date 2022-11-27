package com.example.repasoej3;
import java.util.ArrayList;
import java.util.Date;

import java.time.LocalDate;

public class SistCurling {
    //Realizar un sistema que controle campeonatos de curling. Los equipos se deben
    //anotar en el campeonato indicando sus jugadores y disponibilidad horaria del equipo
    //dividida en turnos: mañana, tarde y noche de lunes a sábados. Los mismos tendrán
    //un nombre, un barrio de procedencia, 10 jugadores y uno de ellos debe ser el
    //capitán del equipo.
    //De los jugadores se debe saber el nombre, fecha de nacimiento y el número de
    //camiseta. Los números de camiseta no se pueden repetir dentro de un mismo
    //equipo.
    //El torneo es todos contra todos y el sistema debe definir los horarios de los partidos
    //dependiendo de la disponibilidad horaria de los equipos. Se debe armar un fixture
    //completo una vez que todos los equipos estén anotados. El fixture del torneo consta
    //de partidos los cuales tienen un día, horario y equipos que jugarán.


    public static void main(String[] args) {
        Jugador Pandelo = new Jugador("Pandelo",13, true);
        Equipo Barcelona = new Equipo("Barcelona","Cataluña");
        Barcelona.getJugadores().add(Pandelo);
        System.out.println(Barcelona);
    }

}
