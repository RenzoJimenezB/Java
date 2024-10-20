package pe.edu.tecsup._04.collections.list.ejercicio3;

public class MarcaProducto implements Comparable<MarcaProducto> {
    private final String marca;

    public MarcaProducto(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "MarcaProducto{" +
                "marca='" + marca + '\'' +
                '}';
    }

    @Override
    public int compareTo(MarcaProducto o) {
        return marca.compareTo(o.marca);
    }
}
