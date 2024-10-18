package Ejercicios.Ejercicio05;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private char sexo;


    public Persona(String nombre, String apellido, int dni, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sexo = sexo;
    }

    public void getFullName() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public void getPersonalInfo() {
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
