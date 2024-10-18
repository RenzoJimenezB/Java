package pe.edu.tecsup._09.object;

public class Persona {
    private Integer codigo;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(Integer codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [codigo=" + codigo + ", nombre=" + nombre + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Persona persona) {
            return persona.getCodigo().equals(this.codigo) &&
                    persona.getNombre().equals(this.nombre);
        }

        return false;
    }

}
