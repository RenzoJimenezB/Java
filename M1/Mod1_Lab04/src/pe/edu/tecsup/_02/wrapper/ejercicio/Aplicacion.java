package pe.edu.tecsup._02.wrapper.ejercicio;

public class Aplicacion {
    public static void main(String[] args) {

        boolean estasEnClases = true;
        Boolean booleanWrapper = estasEnClases;
        boolean booleanRecuperado = booleanWrapper.booleanValue();
        System.out.println("Boolean recuperado: " + booleanRecuperado);


        double nd = 4.1245;
        Double doubleWrapper = nd;
        Double doubleRecuperado = doubleWrapper.doubleValue();
        System.out.println("Double recuperado: " + doubleRecuperado);
    }
}
