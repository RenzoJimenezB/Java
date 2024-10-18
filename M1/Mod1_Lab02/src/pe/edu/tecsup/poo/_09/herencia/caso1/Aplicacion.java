package pe.edu.tecsup.poo._09.herencia.caso1;

public class Aplicacion {

    public static void main(String[] args) {
        
        VentaLima lima = new VentaLima();
        lima.monto = 100;
        lima.igv = 0.18;
        System.out.println(lima.calcularImpuesto());
        
        VentaLoreto iquitos = new VentaLoreto();
        iquitos.monto = 100;
        iquitos.igv = 0.0;
        System.out.println(iquitos.calcularImpuesto());

    }
}
