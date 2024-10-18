package lab_calificado_02.listados;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
    public static void main(String[] args) {

        List<Vuelo> listaLlegadas = new ArrayList<>();
        listaLlegadas.add(new Vuelo("AA301", "American Airlines", "19:02", "Aterrizó"));
        listaLlegadas.add(new Vuelo("CP099", "Copa Airlines", "19:20", "Por confirmar"));
        listaLlegadas.add(new Vuelo("JB090", "Jet Blue", "19:25", "Por confirmar"));
        listaLlegadas.add(new Vuelo("LAN912", "Lan", "19:28", "Por confirmar"));

        List<Vuelo> listaVuelosAterrizados = new ArrayList<>();


        System.out.println("Lista de llegadas:");
        for (Vuelo vuelo : listaLlegadas) {
            System.out.println(vuelo);
        }

        registrarVueloAterrizado(listaLlegadas, listaVuelosAterrizados);

        System.out.println("Lista de vuelos aterrizados:");
        for (Vuelo vuelo : listaVuelosAterrizados) {
            System.out.println(vuelo);
        }
    }

    public static void registrarVueloAterrizado(List<Vuelo> listaLlegadas, List<Vuelo> listaVuelosAterrizados) {
        List<Vuelo> vuelosAterrizados = new ArrayList<>();
        for (Vuelo vuelo : listaLlegadas) {
            if (vuelo.getConfirmacionAterrizaje().equals("Aterrizó")) {
                vuelosAterrizados.add(vuelo);
            }
        }

        listaLlegadas.removeAll(vuelosAterrizados);
        listaVuelosAterrizados.addAll(vuelosAterrizados);
    }
}
