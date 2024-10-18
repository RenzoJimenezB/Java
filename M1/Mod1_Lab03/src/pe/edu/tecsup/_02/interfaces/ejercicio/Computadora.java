package pe.edu.tecsup._02.interfaces.ejercicio;

public class Computadora implements SoporteTarjetaGrafica {
    private String tipoCpu;
    private String fabricante;

    public Computadora(String tipoCpu, String fabricante) {
        this.tipoCpu = tipoCpu;
        this.fabricante = fabricante;
    }

    public String getTipoCpu() {
        return tipoCpu;
    }

    public void setTipoCpu(String tipoCpu) {
        this.tipoCpu = tipoCpu;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "tipoCpu='" + tipoCpu + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }

    @Override
    public String realizarJuegosEnLinea() {
        return "Inicializando juego en línea...";
    }
}
