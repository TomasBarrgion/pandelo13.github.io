import java.util.HashMap;
import java.util.Map;

public class Persona {
    private String nombre;
    private String apellido;
    private int DNI;
    private HashMap<Bebida, Integer> BebidasConsumidas = new HashMap<>();


    public int CoeficienteHidratacion(){
        int coeficienteResultante = 0;
        for (Map.Entry<Bebida, Integer> BebidaActual : BebidasConsumidas.entrySet()) {
            //System.out.println("clave=" + BebidaActual.getKey() + ", valor=" + BebidaActual.getValue());
            coeficienteResultante += BebidaActual.getValue() * (BebidaActual.getKey().getCoeficientePositividad() - BebidaActual.getKey().getCoeficienteNegatividad());
        }
        //System.out.println(coeficienteResultante);
        return (coeficienteResultante);
    }

    //(("Cantidad de bebidas que tomó") * (("Coeficiente positividad")-("Coeficiente negatividad")))

    public Persona(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }

    public Persona() {
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public HashMap<Bebida, Integer> getBebidasConsumidas() {
        return BebidasConsumidas;
    }

    public void setBebidasConsumidas(HashMap<Bebida, Integer> bebidasConsumidas) {
        BebidasConsumidas = bebidasConsumidas;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", DNI=" + DNI +
                ", BebidasConsumidas=" + BebidasConsumidas +
                '}';
    }
}
