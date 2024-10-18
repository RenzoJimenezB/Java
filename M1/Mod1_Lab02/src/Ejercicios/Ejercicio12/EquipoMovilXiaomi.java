package Ejercicios.Ejercicio12;

public class EquipoMovilXiaomi extends EquipoMovil {
    private String memoria;

    public EquipoMovilXiaomi(String marca, String modelo, int anho) {
        super(marca, modelo, anho);
//        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public void obtenerInfo() {
        super.obtenerInfo();
//        System.out.println("Marca: " + getMarca());
//        System.out.println("Modelo: " + getModelo());
//        System.out.println("Anho: " + getAnho());
        System.out.println("Memoria: " + getMemoria());
    }
}
