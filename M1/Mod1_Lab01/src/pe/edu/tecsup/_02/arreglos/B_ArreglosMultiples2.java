package pe.edu.tecsup._02.arreglos;

public class B_ArreglosMultiples2 {

    public static void main(String[] args) {

        // Representacion de las notas de un alumno
        // en 3 cursos, cada curso tiene 4 notas

        int[][] notasAlumno = {
                {14, 17, 18, 16},     // 4 notas del 1er curso
                {10, 19, 12, 15},     // 4 notas del 2do curso
                {11, 13, 9, 20}      // 4 notas del 3er curso
        };

        System.out.println(notasAlumno);

        for (int i = 0; i < notasAlumno.length; i++) {
            System.out.println("Curso " + i + ", notas : " + notasAlumno[i]);
        }

        for (int i = 0; i < notasAlumno.length; i++) {
            System.out.println("Notas del curso :  " + (i + 1));
            for (int j = 0; j < notasAlumno[i].length; j++) {
                System.out.println("Elemento  " + notasAlumno[i][j]);
            }
        }

        for (int[] notasCurso : notasAlumno)
            for (int nota : notasCurso)
                System.out.println(nota);
    }
}
