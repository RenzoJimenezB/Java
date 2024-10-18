package lab_calificado_02.listados;

public class Vuelo {
    private final String numeroVuelo;
    private final String companiaAerea;
    private final String horaLlegada;
    private final String confirmacionAterrizaje;

    public Vuelo(String numeroVuelo, String companiaAerea, String horaLlegada, String confirmacionAterrizaje) {
        this.numeroVuelo = numeroVuelo;
        this.companiaAerea = companiaAerea;
        this.horaLlegada = horaLlegada;
        this.confirmacionAterrizaje = confirmacionAterrizaje;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getCompaniaAerea() {
        return companiaAerea;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public String getConfirmacionAterrizaje() {
        return confirmacionAterrizaje;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "numeroVuelo='" + numeroVuelo + '\'' +
                ", companiaAerea='" + companiaAerea + '\'' +
                ", horaLlegada='" + horaLlegada + '\'' +
                ", confirmacionAterrizaje='" + confirmacionAterrizaje + '\'' +
                '}';
    }
}
