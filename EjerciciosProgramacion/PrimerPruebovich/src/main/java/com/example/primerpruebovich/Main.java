package com.example.primerpruebovich;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EmpleadoSalarioFijo pandelo = new EmpleadoSalarioFijo(215641, "Tomas", "Barrigon",
                LocalDate.of(2004,10,13), 2020, "Martes", 10000);

        EmpleadoAComision Juansito = new EmpleadoAComision(46212726, "Tomas", "Barrigon",
                LocalDate.of(2004,10,13), 2020, "Martes", 100,100, 3000);
        EmpleadoAComision Pepe = new EmpleadoAComision(46212726, "Juan", "Barrigon",
                LocalDate.of(2004,10,13), 2020, "Martes", 101,100, 3000);



        //pandelo.Calculoporcentaje();
        //pandelo.mostrarDatos();
        //Juansito.mostrarDatos();
        SistEmpleados sistEmpleados = new SistEmpleados();
        sistEmpleados.getEmpleados().add(Juansito);
        sistEmpleados.getEmpleados().add(Pepe);

        sistEmpleados.EmpleadoConMasClientes();
    }
}
