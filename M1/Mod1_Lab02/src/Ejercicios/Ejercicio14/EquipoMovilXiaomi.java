package Ejercicios.Ejercicio14;

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
        System.out.println("Memoria: " + getMemoria());
    }

    @Override
    public String toString() {
        return super.toString() + ", {" +
                "memoria='" + memoria + '\'' +
                '}';
    }
}
