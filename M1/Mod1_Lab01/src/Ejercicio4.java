public class Ejercicio4 {
    public static void main(String[] args) {
        int agePedro = 18;
        int ageSilvia = 17;

        boolean isPedroOlder = agePedro > ageSilvia;
        boolean areSameAge = agePedro == ageSilvia;
        boolean hasSilviaSameAgeOrIsOlder = ageSilvia >= agePedro;

        System.out.println(isPedroOlder);
        System.out.println(areSameAge);
        System.out.println(hasSilviaSameAgeOrIsOlder);

        agePedro += 4;
        ageSilvia -= 3;

        System.out.println(isPedroOlder);
        System.out.println(areSameAge);
        System.out.println(hasSilviaSameAgeOrIsOlder);
    }
}
