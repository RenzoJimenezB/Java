package pe.edu.tecsup._06.interfaces.herencias.ejercicio8;

public class Persona {
    protected final String nombre;
    protected final String apellidoPaterno;
    protected final int edad;

    public Persona(String nombre, String apellidoPaterno, int edad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", edad=" + edad +
                '}';
    }
}
