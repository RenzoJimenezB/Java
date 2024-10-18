public class Ejercicio01 {
    public static void main(String[] args) {
        String nombre = "Renzo";
        int edad = 25;
        float altura = 1.70F;
        boolean esCasado = false;

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + String.format("%.2f", altura));
        System.out.println("EsCasado: " + esCasado);
    }
}
