public abstract class Bebida {
    private String nombre;
    private int coeficientePositividad;
    private int coeficienteNegatividad;

    public Bebida() {
    }

    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public Bebida(String nombre, int coeficientePositividad, int coeficienteNegatividad) {
        this.nombre = nombre;
        this.coeficientePositividad = coeficientePositividad;
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public void setCoeficientePositividad(int coeficientePositividad) {
        this.coeficientePositividad = coeficientePositividad;
    }

    public int getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }

    public void setCoeficienteNegatividad(int coeficienteNegatividad) {
        this.coeficienteNegatividad = coeficienteNegatividad;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "nombre='" + nombre + '\'' +
                ", coeficientePositividad=" + coeficientePositividad +
                ", coeficienteNegatividad=" + coeficienteNegatividad +
                '}';
    }
}
