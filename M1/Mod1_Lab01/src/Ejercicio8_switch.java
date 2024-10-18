public class Ejercicio8_switch {
    public static void main(String[] args) {
        int nivelServicio = 1;

        switch (nivelServicio) {
            case 1:
                System.out.println("Nivel 1: Oro");
                break;
            case 2:
                System.out.println("Nivel 2: Platino");
                break;
            case 3:
                System.out.println("Nivel 3: Diamante");
                break;
            default:
                System.out.println("Nivel básico");
                break;
        }
    }
}
