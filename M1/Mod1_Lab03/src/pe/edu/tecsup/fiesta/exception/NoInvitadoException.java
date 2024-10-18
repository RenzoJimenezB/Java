package pe.edu.tecsup.fiesta.exception;

public class NoInvitadoException extends Exception {
    public NoInvitadoException(String message) {
        super("No es un invitado: " + message);
    }
}
