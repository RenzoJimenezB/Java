package pe.edu.tecsup._08.lambda.ejercicio;

@FunctionalInterface
interface ValidacionUsuario {
    boolean validar();
}

public class Aplicacion {
    public static void main(String[] args) {

        ValidacionUsuario validacionUsuario = () -> true;

        System.out.println(validacionUsuario.validar());
    }
}
