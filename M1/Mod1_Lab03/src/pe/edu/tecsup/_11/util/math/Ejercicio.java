package pe.edu.tecsup._11.util.math;

import java.util.Arrays;

public class Ejercicio {
    public static void main(String[] args) {
        double[] randomNumbersArray = new double[5];

        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = Math.random() * 50;
        }
        System.out.println(Arrays.toString(randomNumbersArray));

        // sumar 3 a cada número aleatorio
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] += 3;
        }
        System.out.println(Arrays.toString(randomNumbersArray));

        // hallar el entero superior máximo
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = Math.ceil(randomNumbersArray[i]);
        }
        System.out.println(Arrays.toString(randomNumbersArray));

        // si el número es mayor a 25, elevar a la potencia de 2
        for (int i = 0; i < randomNumbersArray.length; i++) {
            if (randomNumbersArray[i] > 25) {
                randomNumbersArray[i] = Math.pow(randomNumbersArray[i], 2);
            }
        }
        System.out.println(Arrays.toString(randomNumbersArray));
    }
}
