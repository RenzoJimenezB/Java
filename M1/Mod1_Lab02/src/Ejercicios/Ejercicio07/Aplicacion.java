package Ejercicios.Ejercicio07;

public class Aplicacion {
    public static void main(String[] args) {
        OperacionMatematica m = new OperacionMatematica();

        int a = 10;
        int b = 20;
        int c = 30;

        int[] data = {a, b, c, 40, 50};

        System.out.println("La multiplicación es: " + m.multiplicar(a, b));
        System.out.println("La multiplicación es: " + m.multiplicar(a, b, c));
        System.out.println("La multiplicación es: " + m.multiplicar(data));
//        System.out.println("La multiplicación es: " + m.multiplicar(a, b, c, 1, 2));
    }
}
