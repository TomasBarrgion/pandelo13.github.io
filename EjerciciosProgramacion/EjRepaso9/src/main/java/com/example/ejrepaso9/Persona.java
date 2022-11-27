package com.example.ejrepaso9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechanacimiento;
    private ArrayList<Registro> registros = new ArrayList<>();


    //Se debe poder conocer además:
    //- El promedio de peso y de altura en un año.
    //- El porcentaje de crecimiento de un año a otro (indicando un periodo en
    //años)


    public double crecimiento(int año1, int año2){
        double altura1 = this.promedios(año1);
        double altura2 = this.promedios(año2);
        double crecimiento = (altura2/altura1*100);
        return crecimiento;
    }


    public double promedios(int año){
        double cant = 0;
        double sumaPeso = 0;
        double sumaAltura = 0;
        for (int i=0; i<registros.size();i++){
            if (registros.get(i).getFecha().getYear()==año){
            sumaPeso += (registros.get(i).getPeso());
            sumaAltura += (registros.get(i).getAltura());
            cant++;
        }
        }
        System.out.println("EL promedio de peso es : " + sumaPeso/cant);
        System.out.println("EL promedio de altura es: " + sumaAltura/cant);
        return (sumaAltura/cant);
    }

    public void HacerRegistro(double altura, int peso, LocalDate fecha){
        Registro registro = new Registro(altura, peso, fecha);
        this.registros.add(registro);
    }

    public void pesoYalturaDeFecha(LocalDate fechaRegistro){
        for(int i=0; i<registros.size();i++){
            if ((registros.get(i).getFecha()).equals(fechaRegistro)){
                System.out.println("Los registros de ese dia son: " + registros.get(i));
            }
        }
    }

    public Persona(String nombre, String apellido, LocalDate fechanacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public ArrayList<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList<Registro> registros) {
        this.registros = registros;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                ", registros=" + registros +
                '}';
    }
}
