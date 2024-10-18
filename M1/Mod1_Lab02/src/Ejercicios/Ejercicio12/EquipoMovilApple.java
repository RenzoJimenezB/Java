package Ejercicios.Ejercicio12;

public class EquipoMovilApple extends EquipoMovil {
    public EquipoMovilApple(String marca, String modelo, int anho) {
        super(marca, modelo, anho);
    }

    @Override
    public void obtenerInfo() {
        System.out.println("Apple Info: " + getModelo());
    }
}
