public class Ejercicio16 {
    public static void main(String[] args) {
        int[][] gradesByStudent = {
                // {mate, lenguaje}
                {15, 13},
                {13, 18},
                {10, 15}
        };

        int highestGrade = 0;
        for (int[] grades : gradesByStudent) {
            if (grades[1] > highestGrade) {
                highestGrade = grades[1];
            }
        }
        System.out.println("La mayor nota de lenguaje es: " + highestGrade);

        float averageStudentGrade = 0;
        for (int grade : gradesByStudent[2]) {
            averageStudentGrade += grade;
        }
        averageStudentGrade /= gradesByStudent[2].length;
        System.out.println("El promedio de notas del alumno 3 es: " + averageStudentGrade);
    }
}
