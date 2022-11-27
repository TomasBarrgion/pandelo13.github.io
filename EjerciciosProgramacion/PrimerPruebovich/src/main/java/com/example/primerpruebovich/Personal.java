package com.example.primerpruebovich;

import java.time.LocalDate;

public abstract class Personal {
    private int DNI;
    private String nombre;
    private String apellido;
    private LocalDate fechanacimiento;
    private int añoIngreso;
    private String Dialibre;


    public Personal() {
    }

    public Personal(int DNI, String nombre, String apellido, LocalDate fechanacimiento, int añoIngreso, String dialibre) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.añoIngreso = añoIngreso;
        Dialibre = dialibre;
    }

    abstract void mostrarDatos();

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
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

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public String getDialibre() {
        return Dialibre;
    }

    public void setDialibre(String dialibre) {
        Dialibre = dialibre;
    }
}
