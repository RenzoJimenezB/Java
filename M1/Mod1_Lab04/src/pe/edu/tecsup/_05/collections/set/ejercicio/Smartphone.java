package pe.edu.tecsup._05.collections.set.ejercicio;

import java.util.Objects;

public class Smartphone {
    private final int id;
    private final String modelo;
    private final String nombre;

    public Smartphone(int id, String modelo, String nombre) {
        this.id = id;
        this.modelo = modelo;
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;
        return id == that.id && Objects.equals(modelo, that.modelo) && Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, nombre);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
