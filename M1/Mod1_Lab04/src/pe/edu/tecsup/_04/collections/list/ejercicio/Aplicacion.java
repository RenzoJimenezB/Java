package pe.edu.tecsup._04.collections.list.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {
        List<String> vowelList = new ArrayList<>();
        vowelList.add("A");
        vowelList.add("E");
        vowelList.add("I");
        vowelList.add("O");
        vowelList.add("U");

        System.out.println(vowelList);

        int indexE = vowelList.indexOf("E");
        System.out.println("Index of 'E': " + indexE);

        int indexI = vowelList.indexOf("I");
        vowelList.set(indexI, "Y");
        System.out.println(vowelList);

        vowelList.remove("U");
        System.out.println(vowelList);
    }
}
