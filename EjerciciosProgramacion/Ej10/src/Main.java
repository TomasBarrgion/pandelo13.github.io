import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Persona Juan = new Persona("Juan", LocalDate.of(2004,10,10),10);
        Persona Pepe = new Persona("pepe", LocalDate.of(2004,10,10),11);
        Persona Pedro = new Persona("Pedro", LocalDate.of(2004,10,10),30);
        Persona Rodri = new Persona("Rodri", LocalDate.of(2004,10,10),30);

        Platos plato1 = new Platos("plato1", 100);

        Familia familia1 = new Familia();

        familia1.getPersonas().add(Juan);
        familia1.getPersonas().add(Pepe);
        familia1.getPersonas().add(Pedro);
        familia1.getPersonas().add(Rodri);

        Juan.comer(plato1);

        familia1.personaQueMasCaloriasConsumio();
        familia1.personaQueMenosCaloriasConsumio();
        familia1.promedioCalorias();

    }

}