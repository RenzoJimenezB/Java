package pe.edu.tecsup._02.arreglos;

public class A_Arreglos3 {

    public static void main(String[] args) {

        // Calcular el promedio del siguiente arreglo
        float numeros[] = {10.1f, 11.2f, 12.3f, 13.4F, 14.5F};
        float resultado = 0;

        int longitud = numeros.length;

        for (int i = 0; i < longitud; i++) {
            resultado += numeros[i];
        }

        System.out.println("El promedio es : " + resultado / longitud);
    }

}
