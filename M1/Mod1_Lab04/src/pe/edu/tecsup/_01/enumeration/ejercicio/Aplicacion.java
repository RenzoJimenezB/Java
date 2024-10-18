package pe.edu.tecsup._01.enumeration.ejercicio;

public class Aplicacion {
    public static void main(String[] args) {
        if (NivelEducacion.POSTGRADO.compareTo(NivelEducacion.SECUNDARIA) > 0) {
            System.out.println(NivelEducacion.POSTGRADO + " es superior a " + NivelEducacion.SECUNDARIA);
        }

        if (NivelEducacion.POSTGRADO.ordinal() > NivelEducacion.SECUNDARIA.ordinal()) {
            System.out.println(NivelEducacion.POSTGRADO + " es superior a " + NivelEducacion.SECUNDARIA);
        }
    }
}
