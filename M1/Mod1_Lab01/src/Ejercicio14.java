public class Ejercicio14 {
    public static void main(String[] args) {
        int[] numeros = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (i + 1) * 3;
            System.out.println("numeros[i] = " + numeros[i]);

            suma += numeros[i];
            System.out.println("Suma = " + suma);
        }

//        for (int num : numeros) {
//            suma += num;
//            System.out.println("Suma: " + suma);
//        }
    }
}
