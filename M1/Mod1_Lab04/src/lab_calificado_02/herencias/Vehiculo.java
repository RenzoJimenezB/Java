package lab_calificado_02.herencias;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int nroPasajeros;

    public Vehiculo(String placa, String marca, String modelo, int nroPasajeros) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.nroPasajeros = nroPasajeros;
    }

    public void obtenerInformacion() {
        System.out.println("Placa:" + this.placa);
        System.out.println("Marca:" + this.marca);
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Nro de Pasajeros:" + this.nroPasajeros);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", nroPasajeros=" + nroPasajeros +
                '}';
    }
}
