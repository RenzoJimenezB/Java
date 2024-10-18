package pe.edu.tecsup._02.arreglos;

public class A_Arreglos2 {

    public static void main(String[] args) {

        float notasCursoJava[];         // Declaracion
        float[] notasCursoC;            // Declaracion

        notasCursoJava = new float[4];    // Inicializacion

        float notasCursoABAP[] = new float[4]; // Inicializacion
        notasCursoABAP[0] = 14;
        notasCursoABAP[1] = 16;
        notasCursoABAP[2] = 13.5F;
        notasCursoABAP[3] = 17.5F;
        //notas2[4] = 10; // RunTimeException


        // Declaracion y asignacion
        float[] notasCursoPython = {18.5F, 16.0F, 14.0F, 12F};    // 4 elementos

        System.out.println("Primera nota de notasCursoPython: " + notasCursoPython[0]);

        System.out.println("Primera nota de notasCursoABAP: " + notasCursoABAP[0]);

        // Uso de length con for
        for (int i = 0; i < notasCursoABAP.length; i++) {
            System.out.println("notasCursoABAP " + i + ": " + notasCursoABAP[i]);
        }

        // Uso de length con foreach
        for (float nota : notasCursoABAP) {
            System.out.println("notasCursoABAP : " + nota);
        }


    }

}
