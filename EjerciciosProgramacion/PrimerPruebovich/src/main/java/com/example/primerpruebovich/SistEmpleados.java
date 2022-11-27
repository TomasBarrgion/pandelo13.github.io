package com.example.primerpruebovich;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistEmpleados {
    private ArrayList<Personal> empleados = new ArrayList<>();


    public void EmpleadoConMasClientes(){
        EmpleadoAComision elquemas = new EmpleadoAComision();
        int cant = 0;
        for (int i=0; i<empleados.size(); i++){
            if (empleados.get(i).getClass().getName() == "com.example.primerpruebovich.EmpleadoAComision"){
                EmpleadoAComision temporal = (EmpleadoAComision) empleados.get(i);
                if (temporal.getClientescaptados() > cant){
                    elquemas = (EmpleadoAComision) empleados.get(i);
                    cant = temporal.getClientescaptados();
                }
            }
        }
        System.out.println(elquemas.getNombre());
    }

    public ArrayList<Personal> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Personal> empleados) {
        this.empleados = empleados;
    }

    public SistEmpleados() {
    }


}
