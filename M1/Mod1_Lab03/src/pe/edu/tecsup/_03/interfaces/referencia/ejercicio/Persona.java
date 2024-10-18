package pe.edu.tecsup._03.interfaces.referencia.ejercicio;


public class Persona extends PersonaIncompleta {
    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public void habilidadCantar() {
        System.out.println("Me llamo " + this.nombre + " " + this.apellido + " y sé cantar");
    }

    @Override
    public void habilidadCorrer() {
        System.out.println("Me llamo " + this.nombre + " " + this.apellido + " y me preparo para la maratón");

    }

    @Override
    public void habilidadNadar() {
        System.out.println("Me llamo " + this.nombre + " " + this.apellido + " y estoy en la selección de natación");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
