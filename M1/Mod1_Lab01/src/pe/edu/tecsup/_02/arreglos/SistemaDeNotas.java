package pe.edu.tecsup._02.arreglos;

import java.util.Scanner;

public class SistemaDeNotas {

    /**
     * Ingresar 4 notas por consola del curso de Java
     * El sistema debe mostrar:
     * - El promedio
     * - Nota minima
     * - nota maxima
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float[] notas = new float[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingresa la nota: " + (i + 1));
            notas[i] = sc.nextFloat();
        }

        // Mostrar las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + " = " + notas[i]);
        }

        System.out.println("-----------------------------");

        // Promedio
        float sumatoria = 0;
        for (int i = 0; i < notas.length; i++) {
            sumatoria += notas[i];
        }

        float promedio = sumatoria / notas.length;
        System.out.println("Promedio: " + promedio);

        // Nota menor
        float menor = Float.MAX_VALUE;
//		for (int i = 0; i < notas.length; i++) {
//			if (menor > notas[i]) {
//				menor = notas[i];
//			}
//		}
		
        for (float nota : notas) {
            if (menor > nota) {
                menor = nota;
            }
        }
        System.out.println("Nota menor: " + menor);

        // Nota mayor
        float mayor = Float.MIN_VALUE;
//        for (int i = 0; i < notas.length; i++) {
//            if (mayor < notas[i]) {
//                mayor = notas[i];
//            }
//        }

        for (float nota : notas) {
            if (mayor < nota) {
                mayor = nota;
            }
        }
        System.out.println("Nota mayor: " + mayor);

    }

}
