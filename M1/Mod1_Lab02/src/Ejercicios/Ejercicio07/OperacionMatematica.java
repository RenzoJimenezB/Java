package Ejercicios.Ejercicio07;

public class OperacionMatematica {
    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int multiplicar(int a, int b, int c) {
        return a * b * c;
    }

    //    public int multiplicar(int... data) {
    public int multiplicar(int[] data) {
        int multiplication = 1;
        for (int number : data) {
            multiplication *= number;
        }
        return multiplication;
    }
}
