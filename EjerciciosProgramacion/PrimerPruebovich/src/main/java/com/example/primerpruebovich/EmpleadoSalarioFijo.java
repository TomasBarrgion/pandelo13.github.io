package com.example.primerpruebovich;

import java.time.LocalDate;
import java.time.Year;

public class EmpleadoSalarioFijo extends Personal{
    private double sueldoBasico;
    private int porcentajeadicional;


    public EmpleadoSalarioFijo(int DNI, String nombre, String apellido, LocalDate fechanacimiento, int añoIngreso, String dialibre, double sueldoBasico) {
        super(DNI, nombre, apellido, fechanacimiento, añoIngreso, dialibre);
        this.sueldoBasico = sueldoBasico;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getPorcentajeadicional() {
        return porcentajeadicional;
    }

    public void setPorcentajeadicional(int porcentajeadicional) {
        this.porcentajeadicional = porcentajeadicional;
    }

    //que muestre por consola el nombre completo, el salario y el dia libre.

    //Sueldo basico mas porcentaje en funcion de los años que lleva en la empresa
    //Menos de 2 años: nada
    //De 2 a 5 años: 5%
    //Más de 5 años: 10%


    public int Calculoporcentaje(){
        if (LocalDate.now().getYear() - getAñoIngreso() < 2){
            setPorcentajeadicional(0);
        }
        else if ((LocalDate.now().getYear() - getAñoIngreso()) >= 2 && (LocalDate.now().getYear() - getAñoIngreso()) <= 5){
            setPorcentajeadicional(5);
        }
        else if (LocalDate.now().getYear() - getAñoIngreso() > 5){
            setPorcentajeadicional(10);
        }
        return porcentajeadicional;
    }


    @Override
    void mostrarDatos(){
        System.out.println(
                "Nombre completo: " + this.getNombre()+this.getApellido() + "\n" +
                "Salario: " + (sueldoBasico + (sueldoBasico*porcentajeadicional/100)) + "\n" +
                "Dia libre: " + getDialibre());
    }

}
