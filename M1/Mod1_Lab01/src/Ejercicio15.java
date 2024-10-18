public class Ejercicio15 {
    public static void main(String[] args) {
        int[] weekdays = new int[7];
        int workingDays = 0;


        for (int i = 0; i < weekdays.length; i++) {
            if (i <= 4) {
                weekdays[i] = 1;
                workingDays++;
            } else {
                weekdays[i] = 0;
            }
        }

//        for (int day : weekdays) {
//            if (day == 1) {
//                workingDays++;
//            }
//        }
        System.out.println("Días laborables: " + workingDays);
    }
}
