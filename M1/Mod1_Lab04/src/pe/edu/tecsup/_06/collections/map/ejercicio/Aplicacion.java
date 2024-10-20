package pe.edu.tecsup._06.collections.map.ejercicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Aplicacion {
    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("C001", "Jaime");
        names.put("C002", "Ruben");
        names.put("C003", "Maria");

        System.out.println(names.get("C003") + " tiene el código 'C003'");

        System.out.println(".getValue()");
        for (Map.Entry<String, String> entry : names.entrySet()) {
            System.out.println("Nombre: " + entry.getValue());
        }

        System.out.println(".values()");
        for (String name : names.values()) {
            System.out.println("Nombre: " + name);
        }

//        Set<Map.Entry<String, String>> entrySet = names.entrySet();
//        for (Map.Entry<String, String> entry : entrySet) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}
