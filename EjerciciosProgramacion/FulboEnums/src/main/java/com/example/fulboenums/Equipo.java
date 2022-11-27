package com.example.fulboenums;

public enum Equipo {

    BARÇA("FC Barcelona", 1),
    SEVILLA("Sevilla FC",3),
    REALMADRID("Real Madrid",2),
    ATLETICOMADRID("Atletico Madrid", 4),
    VILLAREAL("Villareal Fc",5);

    private String nombreClub;
    private int puestoLiga;


    @Override
    public String toString() {
        return "Equipo{" +
                "nombreClub='" + nombreClub + '\'' +
                ", puestoLiga=" + puestoLiga +
                '}';
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public void setNombreClub(String nombreClub) {
        this.nombreClub = nombreClub;
    }

    public int getPuestoLiga() {
        return puestoLiga;
    }

    public void setPuestoLiga(int puestoLiga) {
        this.puestoLiga = puestoLiga;
    }

    Equipo(String nombreClub, int puestoLiga) {
        this.nombreClub = nombreClub;
        this.puestoLiga = puestoLiga;
    }
}
