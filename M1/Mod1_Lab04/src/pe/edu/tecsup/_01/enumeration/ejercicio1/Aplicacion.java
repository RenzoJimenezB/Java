package pe.edu.tecsup._01.enumeration.ejercicio1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Aplicacion {
    public static void main(String[] args) {
        EstadoEstudiante[] statusEstudiantes = EstadoEstudiante.values();
        System.out.println(Arrays.toString(statusEstudiantes));

        Set<Estudiante> estudiantes = new HashSet<>();

        Estudiante estudiante1 = new Estudiante("Renzo", "Jimenez", EstadoEstudiante.NO_MATRICULADO);
        Estudiante estudiante2 = new Estudiante("Carlos", "Ramirez", EstadoEstudiante.MATRICULADO);

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        System.out.println("\nRegistro de estudiantes:\n" + estudiantes);

        System.out.println("\nEstado inicial:");
        System.out.println(estudiante1);
        System.out.println(estudiante2);

        estudiante1.setEstado(EstadoEstudiante.MATRICULADO);
        estudiante2.setEstado(EstadoEstudiante.EGRESADO);

        System.out.println("\nEstado actualizado:");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
    }
}
