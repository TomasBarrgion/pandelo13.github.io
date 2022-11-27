package com.example.ejrepaso9;

import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.LocalDate;

public class Sistema {
    //Realizar un sistema que controle la altura y peso de una persona a través del
    //tiempo. La persona debe tener un nombre, apellido y fecha de nacimiento.
    //Cada persona cuando se pesa y mide debe registrar su peso y altura justo con la
    //fecha.
    //La persona debe tener una forma de conocer su peso y altura en una fecha en
    //particular.
    //Se debe poder conocer además:
    //- El promedio de peso y de altura en un año.
    //- El porcentaje de crecimiento de un año a otro (indicando un periodo en
    //años)

    public static void main(String[] args) {
        Persona Pande = new Persona("Pandelo", "Cleverthin", LocalDate.of(2004, 10, 13));
        Pande.HacerRegistro(1.75,74,LocalDate.now());
        Pande.HacerRegistro(2,80,LocalDate.of(2022,10,13));
        Pande.HacerRegistro(1,90,LocalDate.of(2020,10,13));
        System.out.println(Pande);
        Pande.pesoYalturaDeFecha(LocalDate.now());
        Pande.promedios(2022);
        System.out.println(Pande.crecimiento(2020,2022));
    }
}
