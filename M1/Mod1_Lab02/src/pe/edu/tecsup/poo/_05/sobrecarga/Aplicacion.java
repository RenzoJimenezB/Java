package pe.edu.tecsup.poo._05.sobrecarga;


public class Aplicacion {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Suma s = new Suma();

        System.out.println("La suma es " + s.sumar());

        System.out.println("La suma es " + s.sumar(12, 13));

        int a = 10;
        int b = 3;
        int c = 13;

        System.out.println("La suma es " + s.sumar(a, b));
        System.out.println("La suma es " + s.sumar(a, b, c));

        int[] datos = {2, 3, 4, 5, 10};
        System.out.println("La suma es " + s.sumar(datos));

        //System.out.println("La suma es " + s.sumar(1,2,3,4,5,6,7,8));

    }

}
