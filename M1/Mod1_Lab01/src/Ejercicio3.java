public class Ejercicio3 {
    static final float IGV = 0.18F;

    public static void main(String[] args) {
        int computerPrice = 4500;
        int computerIGV = Math.round(computerPrice * IGV);
        int finalComputerPrice = computerPrice + computerIGV;

        System.out.println("IGV de una computadora: S/" + computerIGV);
        System.out.println("Precio de computadora con IGV: S/" + finalComputerPrice);

        computerPrice += 300;
        computerIGV = Math.round(computerPrice * IGV);
        finalComputerPrice = computerPrice + computerIGV;

        System.out.println("Precio sin IGV actualizado: S/" + computerPrice);
        System.out.println("Precio con IGV actualizado: S/" + finalComputerPrice);
    }
}
