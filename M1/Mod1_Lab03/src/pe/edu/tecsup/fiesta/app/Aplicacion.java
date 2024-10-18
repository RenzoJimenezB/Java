package pe.edu.tecsup.fiesta.app;

import pe.edu.tecsup.fiesta.exception.NoInvitadoException;

public class Aplicacion {

    public static String[] invitados = {"Juan", "Maria", "Jose"};

    public static void main(String[] args) {

        String nombre = "Renzo";

        try {
            esInvitado(nombre);
            System.out.println("Está en la lista");
        } catch (NoInvitadoException e) {
            System.err.println(e.getMessage());
        }
    }


    public static void esInvitado(String nombre) throws NoInvitadoException {
        for (String invitado : invitados) {
            if (invitado.equals(nombre)) {
                return;
            }
        }
        throw new NoInvitadoException(nombre);
    }
}
