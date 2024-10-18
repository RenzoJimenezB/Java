package pe.edu.tecsup.poo._06.encapsulamiento;

public class Aplicacion {

    public static void main(String[] args) {

        // tipo identificador =
        Alumno alumno1 = new Alumno();

		/*//
		alumno1.nombres = "Jaime Jose";
		alumno1.dni = "Jaime Jose";
        alumno1.edad = 15;
        alumno1.horasEstudio = 10;
        //*/

        alumno1.setNombres("Juan");
        alumno1.setDni("75656787");
        alumno1.setEdad((short) 24);
        alumno1.setHorasEstudio(12);

        System.out.println(alumno1);

        alumno1.saludar("Luis");

//		alumno1.setNombres("Miguel");
//		alumno1.saludar("Luis");

//		Alumno alumno2 = new Alumno();
//		alumno2.setNombres("Pedro");
//		alumno2.setEdad((short) 20);
//
//		Alumno alumno3 = alumno1;
//		alumno3.saludar("Luis");
//
//		Alumno alumno4 = null;

//		System.out.println("Edad de Pedro " + alumno2.getEdad());
    }

}
