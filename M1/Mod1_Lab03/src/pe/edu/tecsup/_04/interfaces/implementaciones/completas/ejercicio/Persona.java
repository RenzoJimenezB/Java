package pe.edu.tecsup._04.interfaces.implementaciones.completas.ejercicio;

public class Persona implements Habilidad, HabilidadTecnica, HabilidadGestion {
    private final String nombre;
    private final String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void cantar() {
        System.out.println(this.nombre + " " + this.apellido + " canta");
    }

    @Override
    public void gestionalConflictosHumanos() {
        System.out.println(this.nombre + " " + this.apellido + " gestiona conflictos humanos");
    }

    @Override
    public void programar() {
        System.out.println(this.nombre + " " + this.apellido + " programa—");
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
