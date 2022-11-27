package com.example.primerpruebovich;

import java.time.LocalDate;

public class EmpleadoAComision extends Personal{
    private int clientescaptados;
    private int montoPorCliente;
    private int salarioMinimo;
    private int salario;

    public EmpleadoAComision() {
    }

    public EmpleadoAComision(int DNI, String nombre, String apellido, LocalDate fechanacimiento, int añoIngreso, String dialibre, int clientescaptados, int montoPorCliente, int salarioMinimo) {
        super(DNI, nombre, apellido, fechanacimiento, añoIngreso, dialibre);
        this.clientescaptados = clientescaptados;
        this.montoPorCliente = montoPorCliente;
        this.salarioMinimo = salarioMinimo;
        this.salario = clientescaptados*montoPorCliente;
    }

    public int getClientescaptados() {
        return clientescaptados;
    }

    public void setClientescaptados(int clientescaptados) {
        this.clientescaptados = clientescaptados;
    }

    public int getMontoPorCliente() {
        return montoPorCliente;
    }

    public void setMontoPorCliente(int montoPorCliente) {
        this.montoPorCliente = montoPorCliente;
    }

    public int getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(int salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //que muestre por consola el nombre completo, el salario y el dia libre.
    //El salario se obtiene multiplicando los clientes captados por el monto por cliente.
    //Si el salario obtenidp por los clientes captados no llega a cubrir el salario minimo cobrará el minimo

    public int calculoSalario(){
        if (salario < salarioMinimo){
            setSalario(salarioMinimo);
        }
        return this.salario;
    }

    @Override
    void mostrarDatos(){
        System.out.println(
                "Nombre completo: " + this.getNombre()+this.getApellido() + "\n" +
                        "Salario: " + (calculoSalario()) + "\n" +
                        "Dia libre: " + getDialibre());
    }
}
