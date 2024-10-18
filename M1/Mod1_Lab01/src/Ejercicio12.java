public class Ejercicio12 {
    public static void main(String[] args) {
        int counter = 20;
        System.out.println("Counter: " + counter);

        do {
            if (counter % 4 == 0) {
                System.out.println(counter + " es múltiplo de 4");
            }
            counter -= 3;
            System.out.println("Counter: " + counter);

        } while (counter >= 4);
    }
}
