public class Ejercicio7 {
    public static void main(String[] args) {
        int age = 0;

        if (0 <= age && age <= 3) {
            System.out.println("Está en casa con sus padres");
        } else if (4 <= age && age <= 6) {
            System.out.println("Está estudiando en el Jardín");
        } else if (7 <= age && age <= 12) {
            System.out.println("Está estudiando en Primaria");
        } else if (13 <= age && age <= 17) {
            System.out.println("Está estudiando en la Secundaria");
        } else {
            System.out.println("Posiblemente esté realizando estudios superiores");
        }
    }
}
