public class Ejercicio9 {
    public static void main(String[] args) {
        int counter = 20;

        while (counter >= 4) {
            System.out.println("Counter: " + counter);

            if (counter % 4 == 0) {
                System.out.println("Soy múltiplo de 4");
            }
            counter -= 2;
        }
    }
}
