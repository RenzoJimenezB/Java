package pe.edu.tecsup._04.collections.list.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {

        List<MarcaProducto> nombresMarcas = new ArrayList<>();
        nombresMarcas.add(new MarcaProducto("HP"));
        nombresMarcas.add(new MarcaProducto("Lenovo"));
        nombresMarcas.add(new MarcaProducto("Samsung"));

        for (MarcaProducto marca : nombresMarcas) {
            System.out.println(marca);
        }

        Collections.sort(nombresMarcas);
        System.out.println("Lista ordenada alfabéticamente por nombre de marca:\n" + nombresMarcas);

        nombresMarcas.sort(Collections.reverseOrder());
        System.out.println("Lista reordenada de manera inversa:\n" + nombresMarcas);
    }
}
