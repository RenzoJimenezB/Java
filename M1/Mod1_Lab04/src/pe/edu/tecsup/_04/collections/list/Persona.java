package pe.edu.tecsup._04.collections.list;

public class Persona {

    private String dni;

    private String nombres;

    public Persona() {
        super();
    }

    public Persona(String dni, String nombres) {
        super();
        this.dni = dni;
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    @Override
    public String toString() {
        return "Persona [dni=" + dni + ", nombres=" + nombres + "]";
    }


    @Override
    public boolean equals(Object object) {

        if (object instanceof Persona persona) { // verifica que se del tipo Persona

            // Logica de negocio
            return persona.dni != null &&
                    persona.dni.equals(this.dni) &&
                    persona.nombres != null &&
                    persona.nombres.equals(this.nombres);

        }

        return false;
    }

}
