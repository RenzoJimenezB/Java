package pe.edu.tecsup._04.collections.list.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {

        List<Character> characters = new ArrayList<>(Arrays.asList('T', 'E', 'C', 'S', 'U', 'P'));
        System.out.println(characters);


        int indexS = characters.indexOf('S');
        System.out.println("Index of 'S': " + indexS);

        characters.set(indexS, 'N');
        characters.set(characters.indexOf('U'), 'O');
        characters.remove(Character.valueOf('P'));

        System.out.println(characters);
    }
}
