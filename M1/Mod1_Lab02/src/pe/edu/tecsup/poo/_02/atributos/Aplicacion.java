package pe.edu.tecsup.poo._02.atributos;

public class Aplicacion {

    public static void main(String[] args) {

        // Se desea usar la clase Persona

        // [ TIPO_CLASE ] [ NOMBRE ] = new TIPO_CLASE();

        // objPersona : es un objeto
        //              es una instancia
        //              es una referencia
        Persona objPersona = new Persona();

        objPersona.nombre = "Jaime";
        objPersona.diaNacimiento = 21;
        objPersona.dni = "9999999";
        objPersona.sexo = 'F';


    }
}
