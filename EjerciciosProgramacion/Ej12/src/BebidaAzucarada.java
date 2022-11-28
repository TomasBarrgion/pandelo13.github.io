public class BebidaAzucarada extends Bebida{
    private int cantAzucar;




    public BebidaAzucarada(String nombre, int cantAzucar) {
        super(nombre);
        this.setCoeficientePositividad(1);
        this.setCoeficienteNegatividad(cantAzucar*10);
        this.cantAzucar = cantAzucar;
    }



    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }


}
