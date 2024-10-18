package lab_calificado_02.herencias;

public class Autobus extends Vehiculo {
    protected String tipoServicio;

    public Autobus(String placa, String marca, String modelo, int nroPasajeros, String tipoServicio) {
        super(placa, marca, modelo, nroPasajeros);
        this.tipoServicio = tipoServicio;
    }
}
