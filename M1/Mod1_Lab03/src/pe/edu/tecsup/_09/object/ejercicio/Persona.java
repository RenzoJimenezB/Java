package pe.edu.tecsup._09.object.ejercicio;

import java.util.Objects;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final int codigo;

    public Persona(String nombre, String apellido, int edad, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return edad == persona.edad && codigo == persona.codigo && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", codigo=" + codigo +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, codigo);
    }
}
