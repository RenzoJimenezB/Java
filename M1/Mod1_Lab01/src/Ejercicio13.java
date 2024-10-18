public class Ejercicio13 {
    public static void main(String[] args) {
        for (int counter = 2; counter < 50; counter += 4) {
            if (counter % 3 == 0) {
                continue;
            }
            System.out.println("Counter: " + counter);
        }
    }
}
