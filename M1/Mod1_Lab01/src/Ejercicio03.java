public class Ejercicio03 {
    public static void main(String[] args) {
        int dividend = 100, divisor = 3;

        int divisionEntera = dividend / divisor;

        float divisionDecimal = (float) dividend / divisor;

        int resto = dividend % divisor;

        System.out.println(divisionEntera);
        System.out.println(divisionDecimal);
        System.out.println(resto);
    }
}
