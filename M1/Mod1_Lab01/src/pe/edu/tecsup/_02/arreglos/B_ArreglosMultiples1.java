package pe.edu.tecsup._02.arreglos;

public class B_ArreglosMultiples1 {

    public static void main(String[] args) {

//		int [][] notasCursoPorAlumno = new int[3][4];

        int[][] notasCursoPorAlumno = {
                {14, 16, 18, 6},  //  Notas de Alumno 1
                {10, 8, 12, 15},  //  Notas de Alumno 2
                {16, 18, 14, 20}   //  Notas de Alumno 3
        };

        System.out.println("Alumno 2, nota3: " + notasCursoPorAlumno[1][2]);

        //float[] sumatorias = new float[notasCursoPorAlumno.length];

//        for (int i = 0; i < notasCursoPorAlumno.length; i++) {
//            //notasCursoPorAlumno[i]: es el arreglo interno
//            for (int j = 0; j < notasCursoPorAlumno[i].length; j++) {
//                System.out.println("Alumno " + (i + 1)
//                        + " - Nota " + (j + 1) + ": " + notasCursoPorAlumno[i][j]);
//            }
//        }

        int alumno = 1;
        for (int[] notas : notasCursoPorAlumno) {
            int curso = 1;

            for (int nota : notas) {
                System.out.println("Alumno " + alumno + " - Nota " + curso + ": " + nota);
                curso++;
            }
            alumno++;
        }
    }

}
