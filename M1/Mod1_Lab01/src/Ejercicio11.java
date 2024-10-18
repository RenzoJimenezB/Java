public class Ejercicio11 {
    public static void main(String[] args) {
        int counter = 40;
        int suma = 0;

        while (counter >= 30) {
            counter--;
            System.out.println("Counter: " + counter);
            System.out.println("Suma: " + suma);

            if (counter % 4 != 0) continue;

            suma += 2;
        }
    }
}
