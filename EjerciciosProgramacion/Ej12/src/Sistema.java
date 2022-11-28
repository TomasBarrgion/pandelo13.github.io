import java.util.ArrayList;

public class Sistema {
    private ArrayList<Persona> personas = new ArrayList<>();


    public void mayorYpeor(){
        int mayor = personas.get(0).CoeficienteHidratacion();
        int menor = personas.get(0).CoeficienteHidratacion();
        Persona Personaconmayorcoef = personas.get(0);
        Persona Personaconmenorcoef = personas.get(0);
        for(int i=0;i<personas.size();i++){
            if(personas.get(i).CoeficienteHidratacion() < menor){
                menor = personas.get(i).CoeficienteHidratacion();
                Personaconmenorcoef = personas.get(i);
            }
            else if (personas.get(i).CoeficienteHidratacion() > mayor){
                mayor=personas.get(i).CoeficienteHidratacion();
                Personaconmayorcoef = personas.get(i);
            }
        }
        System.out.println("La persona con mayor coeficiente de hidratación es: " + (Personaconmayorcoef) + "\n" +
        "La persona con menor coeficiente de hidratación es: " + (Personaconmenorcoef));
    }

    public Sistema(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Sistema() {
    }
}
