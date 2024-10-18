public class Ejercicio5 {
    public static void main(String[] args) {
        boolean isWildfireActive = true;
        boolean isGovernmentTakingAction = false;

        boolean isWildfireContained = isWildfireActive && isGovernmentTakingAction;

        System.out.println(isWildfireContained);

        boolean canTravelByLinea2 = true;
        boolean canTravelByCombi = true;

        boolean canArriveByAntMeans = canTravelByLinea2 || canTravelByCombi;

        System.out.println(canArriveByAntMeans);
    }
}
