package pe.edu.tecsup.poo._04.constructor;

public class Persona {
    
    // atributos
	String nombre;
    int diaNacimiento;
    String dni;
    char sexo;
    
    /**
     * Es lo primero que se ejecuta al instanciar una clase
     */
    public Persona() {    	
//    	this.nombre="Roberto";
//    	this.diaNacimiento=21;
//    	this.dni="9999999";
//    	this.sexo='M';
    	System.out.println("----------------------");
    	System.out.println("Instanciando un objeto");
    }
    
    /**
     * Constructor que inicializa todos los atributos de la clase
     * @param nombre
     * @param edad
     * @param dni
     * @param sexo
     */
    public Persona(String nombre, int edad, String dni, char sexo) {
    	this.nombre= nombre;
    	this.diaNacimiento=edad;
    	this.dni=dni;
    	this.sexo = sexo;
    }
    
  
    
}
