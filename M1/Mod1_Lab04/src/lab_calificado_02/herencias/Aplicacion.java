package lab_calificado_02.herencias;

public class Aplicacion {
    public static void main(String[] args) {
        Sedan miSedan = new Sedan("ABC-123", "Volkswagen", "modelo", 5);
        SUV miSUV = new SUV("ABC-123", "Mitsubishi", "modelo", 5);
        AutobusElectrico miAutobusElectrico = new AutobusElectrico("ABC-123", "Mercedes Benz", "modelo", 25, "Privado", 220);

        System.out.println(miSedan);
        System.out.println(miSUV);
        System.out.println(miAutobusElectrico);
    }
}
