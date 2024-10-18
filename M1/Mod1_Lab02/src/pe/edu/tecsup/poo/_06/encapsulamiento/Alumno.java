package pe.edu.tecsup.poo._06.encapsulamiento;

public class Alumno {

    // cotrol de acceso (atributos)
    public String nombres;
    protected String dni;
    Short edad;
    private Integer horasEstudio;

    // comportamiento (metodo)
    public void saludar(String amigo) {
        System.out.println("Hola " + amigo
                + ", me llamo " + this.nombres);
    }

    // Metodos de acceso

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }

    public Integer getHorasEstudio() {
        return horasEstudio;
    }

    public void setHorasEstudio(Integer horasEstudio) {
        this.horasEstudio = horasEstudio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombres='" + nombres + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", horasEstudio=" + horasEstudio +
                '}';
    }
}
