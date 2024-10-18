package pe.edu.tecsup._05.interfaces.implementaciones.parciales;

public class Persona extends PersonaIncompleta {
    public Persona(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    @Override
    public void cantar() {
        System.out.println("YO CANTO");
    }

    @Override
    public void correr() {
        System.out.println("Me llamo " + this.getNombre() + " y suelo correr por las tardes");
    }
}
