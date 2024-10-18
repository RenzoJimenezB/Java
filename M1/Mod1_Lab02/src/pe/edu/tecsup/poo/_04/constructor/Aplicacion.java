package pe.edu.tecsup.poo._04.constructor;

public class Aplicacion {

    public static void main(String[] args) {

//    	Persona objPersona=new Persona();
//        objPersona.nombre="Jaime";
//        objPersona.diaNacimiento=21;
//        objPersona.dni="9999999";    	

        // llama al constructor vacio
//     Persona objPersona=new Persona();

        // llama al constructor con parametros
        Persona objPersona = new Persona("Cristina", 1, "12345678", 'F');

        System.out.println("Mi nombre es: " + objPersona.nombre +
                "\nEl dia de nacimiento es: " + objPersona.diaNacimiento +
                "\nEl sexo es: " + objPersona.sexo +
                "\nEl DNI es: " + objPersona.dni);


    }
}
