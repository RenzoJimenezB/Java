package pe.edu.tecsup._03.collections.ejercicio;

import java.util.ArrayList;
import java.util.Collection;

public class Aplicacion {
    public static void main(String[] args) {
        Collection<String> diasSemana = new ArrayList<>();
        System.out.println(diasSemana);

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
        System.out.println("Hay " + diasSemana.size() + " días: " + diasSemana);

        if (diasSemana.contains("Miercoles")) {
            System.out.println("Miercoles está en la lista");
        }
    }
}
