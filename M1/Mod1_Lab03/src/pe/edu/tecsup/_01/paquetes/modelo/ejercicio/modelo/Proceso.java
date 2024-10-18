package pe.edu.tecsup._01.paquetes.modelo.ejercicio.modelo;

public class Proceso {
    private String codigo;
    private String nombre;

//    public Proceso(String codigo, String nombre) {
//        this.codigo = codigo;
//        this.nombre = nombre;
//    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Proceso { " +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                " }";
    }
}
