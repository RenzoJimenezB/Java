package pe.edu.tecsup._04.collections.list.ejercicio2;

import java.util.Objects;

public class Auto implements Comparable<Auto> {
    private final String modelo;
    private final String nombre;

    public Auto(String modelo, String nombre) {
        this.modelo = modelo;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(Auto o) {
        int compareModelo = modelo.compareTo(o.modelo);
        int compareNombre = nombre.compareTo(o.nombre);

        if (compareNombre == 0) {
            return compareModelo;
        }

        return compareNombre;

//        return modelo.compareTo(o.modelo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto auto)) return false;
        return Objects.equals(modelo, auto.modelo) && Objects.equals(nombre, auto.nombre);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelo, nombre);
    }
}
