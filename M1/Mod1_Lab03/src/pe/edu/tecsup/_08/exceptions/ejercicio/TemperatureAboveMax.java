package pe.edu.tecsup._08.exceptions.ejercicio;

public class TemperatureAboveMax extends RuntimeException {
    public TemperatureAboveMax(String message) {
        super(message + ". Turning off oven...");
    }
}
