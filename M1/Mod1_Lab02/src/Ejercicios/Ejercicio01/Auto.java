package Ejercicios.Ejercicio01;

public class Auto {
    private String color;
    private String placa;
    private String marca;
    private int year;

    public Auto(String color, String placa, String marca, int year) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.year = year;
    }

//    public void imprimirValores() {
//        System.out.println("Color: " + this.color);
//        System.out.println("Placa: " + this.placa);
//        System.out.println("Marca: " + this.marca);
//        System.out.println("Year: " + this.year);
//    }

    public String obtenerInfo() {
        return this.placa + " - " + this.marca.toUpperCase();
    }

    public String obtenerInfoEvaluada(int fechaEvaluacion) {
        if (this.year < fechaEvaluacion) {
            return "El auto debe de placa '" + this.placa + "' ser renovado";
        } else {
            return obtenerInfo();
        }
    }

    @Override
    public String toString() {
        return "Auto{color=" + color + ", placa=" + placa + ", marca=" + marca + ", year=" + year + '}';
    }
}

