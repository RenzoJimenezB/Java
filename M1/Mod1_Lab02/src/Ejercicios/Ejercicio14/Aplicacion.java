package Ejercicios.Ejercicio14;

public class Aplicacion {
    public static void main(String[] args) {

        EquipoMovilSamsung samsung = new EquipoMovilSamsung("Samsung", "Samsung", 2024);
        System.out.println(samsung);

        EquipoMovilApple apple = new EquipoMovilApple("Apple", "Iphone 16", 2024);
        System.out.println(apple);

        EquipoMovilXiaomi xiaomi = new EquipoMovilXiaomi("Xiaomi", "Redmi Note 11", 2022);
        xiaomi.setMemoria("4GB");
        System.out.println(xiaomi);
    }
}
