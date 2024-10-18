package pe.edu.tecsup._06.interfaces.herencias.ejercicio8;

public class Profesional extends Persona implements Capacitaciones {
    private final String nombreCarrera;
    private final int anhosExperiencia;

    public Profesional(String nombre, String apellidoPaterno, int edad, String nombreCarrera, int anhosExperiencia) {
        super(nombre, apellidoPaterno, edad);
        this.nombreCarrera = nombreCarrera;
        this.anhosExperiencia = anhosExperiencia;
    }

    @Override
    public void hablarIngles() {
        System.out.println(this.nombre + " " + this.apellidoPaterno + " habla inglés");
    }

    @Override
    public void programarJava() {
        System.out.println(this.nombre + " " + this.apellidoPaterno + " programa en Java");
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "nombreCarrera='" + nombreCarrera + '\'' +
                ", anhosExperiencia=" + anhosExperiencia +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", edad=" + edad +
                '}';
    }
}
