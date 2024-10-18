package Ejercicios.Ejercicio14;

public class EquipoMovil {
    private final String marca;
    private final String modelo;
    private final int anho;

    public EquipoMovil(String marca, String modelo, int anho) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "EquipoMovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anho=" + anho +
                '}';
    }
    
    public void obtenerInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Anho: " + this.anho);
    }
}