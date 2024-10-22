package pe.edu.tecsup._07.anotaciones.ejercicio;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Curso {
    String nombre();

    int numHoras();

    int creditos();
}

public class Aplicacion {
    public static void main(String[] args) {

        ejecutarCurso();
    }

    @Curso(nombre = "Sintaxis", numHoras = 5, creditos = 4)
    public static void ejecutarCurso() {

        try {
            Method method = Aplicacion.class.getMethod("ejecutarCurso");
            Curso curso = method.getAnnotation(Curso.class);

            System.out.println(curso.nombre());
            System.out.println(curso.numHoras());
            System.out.println(curso.creditos());
        } catch (NoSuchMethodException e) {
            System.out.println("No se puede ejecutar el curso");
            throw new RuntimeException(e);
        }
    }
}
