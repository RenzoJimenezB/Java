package pe.edu.tecsup._05.interfaces.implementaciones.parciales;

/**
 * Clase abstracta : no implementa todos los metodos de las interfaces
 *
 * @author jgomez
 */
public abstract class PersonaIncompleta implements HabilidadCantar, HabilidadCorrer, HabilidadNadar {
    private final String nombre;
    private final String apellidos;

    public PersonaIncompleta(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

//    @Override
//    public void cantar() {
//        System.out.println("Me llamo " + this.nombre + " " + this.apellidos + " y me encanta CANTAR...");
//    }

    public abstract void cantar(); // this is equivalent to omitting the abstract declaration since the subclasses will be prompted to complete the interface declaring the missing interface contract method.

    @Override
    public void correr() {
        System.out.println("Me llamo " + this.nombre + " " + this.apellidos + " y me encanta CORRER...");
    }

    @Override
    public void nadar() {
        System.out.println("Me llamo " + this.nombre + " " + this.apellidos + " y me encanta NADAR...");
    }
}

// 'abstract' allows the class to be defined without requiring implementation for all the methods declared in the interface
// subclasses of an abstract class must implement the remaining methods to complete the interface