package pe.edu.tecsup._05.collections.set;

import java.util.HashSet;
import java.util.Set;

public class TestMain5 {

    public static void main(String[] args) {

        Set<String> nombres = new HashSet<>();

        nombres.add("Juan");
        nombres.add("Juan");
        nombres.add("Miguel");
        nombres.add("Miguel");
        nombres.add("Miguel");
        nombres.add("Miguel");
        nombres.add("Julio");
        nombres.add("Maria");

        System.out.println(nombres);

        // foreach
        for (String string : nombres) {
            System.out.println(string);
        }


    }

}
