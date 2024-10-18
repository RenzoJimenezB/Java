package Ejercicios.Ejercicio12;

public class EquipoMovil {
    private String marca;
    private String modelo;
    private int anho;

    public EquipoMovil(String marca, String modelo, int anho) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public void obtenerInfo() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Anho: " + this.anho);
    }
}
