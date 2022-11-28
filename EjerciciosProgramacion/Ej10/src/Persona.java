import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechanacimiento;
    private int cantCalorias;


    public Persona() {
    }

    public Persona(String nombre, LocalDate fechanacimiento, int cantCalorias) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.cantCalorias = cantCalorias;
    }

    public void comer(Platos plato){
        this.cantCalorias += plato.getCalorias();
    }

    public Persona(String nombre, LocalDate fechanacimiento) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                ", cantCalorias=" + cantCalorias +
                '}';
    }
}
