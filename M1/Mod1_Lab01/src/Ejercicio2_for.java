public class Ejercicio2_for {
    public static void main(String[] args) {

        for (int i = 2; i <= 512; i *= 2) {
            System.out.println("Counter: " + i);
        }

        System.out.println("Reiniciando counter...");

        for (int i = 2; i <= 512; i *= 2) {
            System.out.println("Counter: " + i);
            if (i == 64) {
                break;
            }
        }

        System.out.println("Reiniciando counter...");

        for (int i = 2; i <= 512; i *= 2) {
            if (i == 32 || i == 64) {
                continue;
            }
            System.out.println("Counter: " + i);
        }
    }
}

