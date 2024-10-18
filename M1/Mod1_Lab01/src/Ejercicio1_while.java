public class Ejercicio1_while {
    /*
     *
     * Imprimir todos los number que sigan esta serie
     *
     *
     * 2, 4, 8,16,32,64,128,256,512
     *
     * 2, 4, 8,16,32,64 break
     *
     * 2, 4, 8,16,128,256,512 continue
     *
     */
    public static void main(String[] args) {

        int counter = 2;
        System.out.println("Counter: " + counter);

        while (counter < 512) {
            counter *= 2;
            System.out.println(counter);
        }

        System.out.println("Reiniciando counter...");

        counter = 2;
        System.out.println("Counter: " + counter);
        while (counter < 512) {
            counter *= 2;
            System.out.println(counter);
            if (counter == 64) {
                break;
            }
        }

        System.out.println("Reiniciando counter...");


        counter = 2;
        System.out.println("Counter: " + counter);
        while (counter < 512) {
            counter *= 2;
            if (counter == 32 || counter == 64) {
                continue;
            }
            System.out.println(counter);
        }
    }
}
