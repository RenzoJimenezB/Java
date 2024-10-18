package Ejercicios.Ejercicio12;

public class Aplicacion {
    public static void main(String[] args) {

        EquipoMovilApple apple = new EquipoMovilApple("Apple", "Iphone 16", 2024);
//        apple.setMarca("Apple");
//        apple.setModelo("Iphone 16");
//        apple.setAnho(2024);

        apple.obtenerInfo();

        EquipoMovilSamsung samsung = new EquipoMovilSamsung("Samsung", "Samsung", 2024);
//        samsung.setMarca("Samsung");
//        samsung.setModelo("Samsung");
//        samsung.setAnho(2024);

        samsung.obtenerInfo();

        EquipoMovilXiaomi xiaomi = new EquipoMovilXiaomi("Xiaomi", "Redmi Note 11", 2022);
//        xiaomi.setMarca("Xiaomi");
//        xiaomi.setModelo("Redmi Note 11");
//        xiaomi.setAnho(2022);
        xiaomi.setMemoria("4GB");

        xiaomi.obtenerInfo();
    }
}
