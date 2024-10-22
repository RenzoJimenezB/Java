package pe.edu.tecsup._08.lambda.ejercicio1;

@FunctionalInterface
interface OperacionMatematica {
    double procesar(int a, int b);
}

public class Aplicacion {
    public static void main(String[] args) {
        OperacionMatematica operacionMatematica = (a, b) -> a + b;
        System.out.println(operacionMatematica.procesar(10, 20));

        operacionMatematica = (a, b) -> a - b;
        System.out.println(operacionMatematica.procesar(10, 20));
    }
}
