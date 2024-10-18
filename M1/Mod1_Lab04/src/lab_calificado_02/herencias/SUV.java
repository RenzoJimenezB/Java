package lab_calificado_02.herencias;

public class SUV extends Vehiculo {
    protected boolean dobleTraccion = true;

    public SUV(String placa, String marca, String modelo, int nroPasajeros) {
        super(placa, marca, modelo, nroPasajeros);
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Doble traccion:" + this.dobleTraccion);
    }

    @Override
    public String toString() {
        return "SUV{" +
                "dobleTraccion=" + dobleTraccion +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nroPasajeros=" + nroPasajeros +
                '}';
    }
}
