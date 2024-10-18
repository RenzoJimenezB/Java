package pe.edu.tecsup._03.interfaces.referencia.ejercicio;

public class Aplicacion {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Carlos", "Perez");
        Persona persona2 = new Persona("Luis", "Gomez");

        persona1.habilidadCantar();
        persona2.habilidadCantar();

        persona1.habilidadCorrer();
        persona2.habilidadNadar();

        HabilidadCantar habilidad1 = new Persona("Inteface", "Reference");
        habilidad1.habilidadCantar();

//        HabilidadCantar habilidad1 = persona1;
//        HabilidadCantar habilidad2 = persona2;
//
//        habilidad1.habilidadCantar();
//        habilidad2.habilidadCantar();

    }
}
