import java.util.ArrayList;
import java.util.HashMap;

public class Familia {
    private ArrayList<Persona> personas = new ArrayList<>();


    public Persona personaQueMenosCaloriasConsumio(){
        int elquemenos = personas.get(1).getCantCalorias();
        Persona elquemenosP = new Persona();
        for (int i=0;i<personas.size();i++){
            if (personas.get(i).getCantCalorias()<elquemenos){
                elquemenos = personas.get(i).getCantCalorias();
                elquemenosP = personas.get(i);
            }
        }
        System.out.println(elquemenosP);
        return elquemenosP;
    }

    public Persona personaQueMasCaloriasConsumio(){
        int elquemas=0;
        Persona elquemasP = new Persona();
        for (int i=0;i<personas.size();i++){
            if (personas.get(i).getCantCalorias()>elquemas){
                elquemas = personas.get(i).getCantCalorias();
                elquemasP = personas.get(i);
            }
        }
        System.out.println(elquemasP);
        return elquemasP;

    }

    public int promedioCalorias(){
        int calorias = 0;
        int cant = 0;
        for(int i=0;i<personas.size();i++){
            calorias += personas.get(i).getCantCalorias();
            cant++;
        }
        System.out.println(calorias/cant);
        return (calorias/cant);
    }

    public Familia(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }


    public Familia() {
    }
}
