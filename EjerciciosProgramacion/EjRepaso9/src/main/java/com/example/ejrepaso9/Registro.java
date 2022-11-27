package com.example.ejrepaso9;

import java.time.LocalDate;

public class Registro {
    private double altura;
    private int peso;
    private LocalDate fecha;

    public Registro(double altura, int peso, LocalDate fecha) {
        this.altura = altura;
        this.peso = peso;
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Registro{" +
                "altura=" + altura +
                ", peso=" + peso +
                ", fecha=" + fecha +
                '}';
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
