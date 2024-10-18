package pe.edu.tecsup._08.exceptions.ejercicio;

public class Aplicacion {
    public static void main(String[] args) {

        int temperature = 1099;
        boolean isOvenOn = true;
        System.out.println("IsOvenOn = " + isOvenOn);

        try {
            System.out.println("Current temperature: " + temperature + "°C");
            isTemperatureAboveMax(temperature);

        } catch (TemperatureAboveMax e) {
            System.err.println(e.getMessage());

//            isOvenOn = false;
//            System.out.println("IsOvenOn = " + isOvenOn);
        }
    }

    public static void isTemperatureAboveMax(int temperature) {
        if (temperature > 1000) {
            throw new TemperatureAboveMax("Temperature is above max");
        }
    }
}
