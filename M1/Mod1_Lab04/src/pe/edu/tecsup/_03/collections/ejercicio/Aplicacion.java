package pe.edu.tecsup._03.collections.ejercicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {
        Collection<String> diasSemana = new ArrayList<>();
        System.out.println(diasSemana);

//        List<String> diasSemana = Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo", "Feriado");
//        Arrays.asList() creates a fixed-size list (cannot add or remove elements)
//        it is only possible to modify elements through .set()

        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miercoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sabado");
        diasSemana.add("Domingo");
        diasSemana.add("Feriado");
        System.out.println(diasSemana);

        diasSemana.remove("Feriado");
//        diasSemana.set(0, "a");
        System.out.println("Hay " + diasSemana.size() + " días: " + diasSemana);

        if (diasSemana.contains("Miercoles")) {
            System.out.println("Miercoles está en la lista");
        }
    }
}
