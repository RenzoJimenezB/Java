package pe.edu.tecsup._08.exceptions;

public class ExceptionTestMain {

    public static String cadena;

    public static void main(String[] args) {


        try {
            int n = 4 / 1;
        } catch (Exception e) {
            System.out.println("Hay una anomalia");
        }


        try {
            cadena = "Un texto de ejemplo...";
            String minuscula = cadena.toLowerCase();
            System.out.println("minuscula: " + minuscula);

            int nparticipantes = 20;
            int nbloques = 1;

            if (nbloques == 0) {
                // lanzar una excepcion controlada
//                throw new ArithmeticException("N bloques igual a cero");
                throw new ArithmeticException();
            }

            System.out.println(nparticipantes / nbloques);

            int[] notas = new int[1];
            notas[3] = 16;  // esto genera una exception 

        } catch (NullPointerException e) {
            System.err.println("Error null pointer exception");
        } catch (ArithmeticException e) {
            System.err.println("Error en division: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error general: " + e.getMessage());
        }

        System.out.println("Fin de la aplicacion sin problemas");
    }
}
