package pe.edu.tecsup.poo.constructor.ejercicio;

public class Estudiante {
    private final String nombre;
    private final String apellidoPaterno;
    final int edad;

    public Estudiante(String nombre, String apellidoPaterno, int edad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoPaterno);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", edad=" + edad +
                '}';
    }
}
