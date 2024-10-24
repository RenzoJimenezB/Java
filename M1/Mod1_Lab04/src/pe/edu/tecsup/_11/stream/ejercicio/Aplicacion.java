package pe.edu.tecsup._11.stream.ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aplicacion {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 2; i <= 80; i += 2) {
            numbers.add(i);
        }
        System.out.println(numbers);

        numbers.stream()
                .max(Integer::compareTo)
                .ifPresentOrElse(max -> System.out.println("Max: " + max),
                        () -> System.out.println("No max"));

        numbers.stream()
                .min(Integer::compareTo)
                .ifPresent(min -> System.out.println("Min: " + min));

        int sumOfNumbers = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Suma: " + sumOfNumbers);


        List<Integer> orderedList = numbers.stream()
                .filter(value -> value % 4 == 0 && value > 35)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Números múltiplos de 4 y mayores a 35: " + orderedList);
    }
}
