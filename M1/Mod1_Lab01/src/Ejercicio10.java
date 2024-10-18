public class Ejercicio10 {
    public static void main(String[] args) {
        int counter = 40;

        while (counter >= 30) {
            counter -= 2;
            System.out.println("Counter: " + counter);

            if (counter % 5 == 0) {
                break;
            }
        }
    }
}
