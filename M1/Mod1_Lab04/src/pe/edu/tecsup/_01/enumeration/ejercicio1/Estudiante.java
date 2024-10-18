package pe.edu.tecsup._01.enumeration.ejercicio1;

public class Estudiante {
    private final String nombre;
    private final String apellido;
    private EstadoEstudiante estado;

    public Estudiante(String nombre, String apellido, EstadoEstudiante estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    public EstadoEstudiante getEstado() {
        return estado;
    }

    public void setEstado(EstadoEstudiante estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estado=" + estado +
                '}';
    }
}
