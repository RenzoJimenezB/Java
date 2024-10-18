package pe.edu.tecsup.poo._09.herencia.caso1;

public class Venta {

    int monto;
    double igv;

    public double calcularImpuesto() {

        return monto * igv;
    }

}
