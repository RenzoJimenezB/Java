package pe.edu.tecsup._02.wrapper.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número entero:");
            int number = scanner.nextInt();

            Integer wrappedNumber = number;
            int result = (int) Math.pow(wrappedNumber, 2);

            System.out.println("El cuadrado del número ingresado es: " + result);

        } catch (InputMismatchException e) {
            System.err.println("Error: debe ingresar un número entero");
        } finally {
            scanner.close();
        }

    }
}
