public class Main {
    public static void main(String[] args) {

        Persona Tomas = new Persona("Tomas","Barrigon",123456789);
        Persona Juan = new Persona("Juan","a",123456789);
        Persona Pedro = new Persona("Pedro","b",123456789);

        BebidaNeutra Agua = new BebidaNeutra("Agua", 20, 0);
        BebidaAlcoholica Cerveza = new BebidaAlcoholica("Cerveza", 5);
        BebidaAzucarada Coca = new BebidaAzucarada("Coca", 5);

        Tomas.getBebidasConsumidas().put(Agua,3);
        Tomas.getBebidasConsumidas().put(Coca,2);
        Juan.getBebidasConsumidas().put(Agua,5);
        Juan.getBebidasConsumidas().put(Cerveza,1);
        Juan.getBebidasConsumidas().put(Coca,2);
        Pedro.getBebidasConsumidas().put(Agua, 1);
        Pedro.getBebidasConsumidas().put(Cerveza,2);
        Pedro.getBebidasConsumidas().put(Coca,4);

       // System.out.println(Tomas.getBebidasConsumidas().get(Coca));
        Sistema sist1 = new Sistema();
        sist1.getPersonas().add(Tomas);
        sist1.getPersonas().add(Juan);
        sist1.getPersonas().add(Pedro);

        //Tomas.CoeficienteHidratacion();
        //Juan.CoeficienteHidratacion();
        //Pedro.CoeficienteHidratacion();
        sist1.mayorYpeor();
    }
}