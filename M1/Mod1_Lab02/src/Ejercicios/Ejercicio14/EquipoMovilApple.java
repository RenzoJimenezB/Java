package Ejercicios.Ejercicio14;

public class EquipoMovilApple extends EquipoMovil {
    public EquipoMovilApple(String marca, String modelo, int anho) {
        super(marca, modelo, anho);
    }
    
    @Override
    public String toString() {
        return super.toString() + " IPHONE";
    }
}
