package pe.edu.tecsup._05.collections.set.ejercicio;

import java.util.HashSet;
import java.util.Set;

public class Aplicacion {
    public static void main(String[] args) {
        Set<Smartphone> smartphones = new HashSet<>();
        smartphones.add(new Smartphone(1, "X001", "Xiaomi"));
        smartphones.add(new Smartphone(2, "X002", "Samsung"));
        smartphones.add(new Smartphone(3, "X003", "Huawei"));

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        smartphones.add(new Smartphone(2, "X002", "Samsung"));
        smartphones.add(new Smartphone(3, "X002", "iPhone"));

        System.out.println("Updated set:");
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone newSmartphone = new Smartphone(2, "X002", "Samsung");

        if (smartphones.contains(newSmartphone)) {
            System.out.println("Se encuentra en el Set -> " + newSmartphone);
        } else {
            System.out.println("No se encuentra en el Set -> " + newSmartphone);
        }
    }
}
