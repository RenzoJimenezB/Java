public class Ejercicio8 {
    public static void main(String[] args) {
        int edad = 0;

        if (edad < 3) {
            System.out.println("No va al colegio");
        } else if (4 <= edad && edad <= 6) {
            System.out.println("Va a kinder");
        } else if (7 <= edad && edad <= 12) {
            System.out.println("Va a la primaria");
        } else if (12 <= edad && edad <= 17) {
            System.out.println("Va a la secundaria");
        } else {
            System.out.println("Puede realizar estudios superiores");
        }
    }
}
