package lab_calificado_02.herencias;

public class AutobusElectrico extends Autobus{
    protected int autonomia;

    public AutobusElectrico(String placa, String marca, String modelo, int nroPasajeros, String tipoServicio, int autonomia) {
        super(placa, marca, modelo, nroPasajeros, tipoServicio);
        this.autonomia = autonomia;
    }

    @Override
    public void obtenerInformacion() {
        super.obtenerInformacion();
        System.out.println("Bus autonomo: " + autonomia);
    }

    @Override
    public String toString() {
        return "AutobusElectrico{" +
                "autonomia=" + autonomia +
                "km, tipoServicio='" + tipoServicio + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nroPasajeros=" + nroPasajeros +
                '}';
    }
}
