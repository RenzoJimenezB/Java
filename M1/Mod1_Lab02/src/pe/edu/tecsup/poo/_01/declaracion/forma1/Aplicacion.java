package pe.edu.tecsup.poo._01.declaracion.forma1;

public class Aplicacion {

    public static void main(String[] args) {

        Caja miCaja = new Caja();

        int vol;

        miCaja.largo = 8;
        miCaja.ancho = 10;
        miCaja.altura = 2;

        vol = miCaja.largo * miCaja.ancho * miCaja.altura;

        System.out.println("El volumen es mi Caja es " + vol);


        Caja miOtraCaja = new Caja();

        miOtraCaja.largo = 8;
        miOtraCaja.ancho = 10;
        miOtraCaja.altura = 2;

        vol = miOtraCaja.largo * miOtraCaja.ancho * miOtraCaja.altura;

        System.out.println("El volumen de mi otra Caja es " + vol);


    }

}
