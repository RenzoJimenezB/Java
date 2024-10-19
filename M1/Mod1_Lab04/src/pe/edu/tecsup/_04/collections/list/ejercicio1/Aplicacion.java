package pe.edu.tecsup._04.collections.list.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {
        Auto auto1 = new Auto("X002", "Nissan");

        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("X001", "Toyota"));
        autos.add(new Auto("X002", "Nissan"));
        autos.add(new Auto("Y003", "Peugeot"));
        autos.add(new Auto("X003", "Peugeot"));

        for (Auto auto : autos) {
            System.out.println(auto);
        }

        autos.sort(Collections.reverseOrder());
//        Collections.sort(autos);

        System.out.println(autos);

//        for (Auto auto : autos) {
//            System.out.println(auto.getModelo());
//        }

        if (autos.contains(auto1)) {
            System.out.println("El auto " + auto1.getNombre() + " se encuentra en la lista de autos");
        } else {
            System.out.println(auto1.getNombre() + " no se encuentra en la lista de autos");
        }
    }
}
