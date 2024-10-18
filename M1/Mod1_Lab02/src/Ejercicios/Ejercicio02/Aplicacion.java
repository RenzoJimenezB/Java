package Ejercicios.Ejercicio02;

public class Aplicacion {
    public static void main(String[] args) {

        SportsTeam team1 = new SportsTeam("Spain", "Soccer", "FC Barcelona", 11);
        SportsTeam team2 = new SportsTeam("Spain", "Soccer", "Real Madrid", 11);

        System.out.println(team1);
        System.out.println(team2);

        team1.setCountry("Peru");
        team1.setSport("Basketball");
        team1.setName("Selección de Basketball");

        team2.setCountry("Peru");
        team2.setSport("Volleyball");
        team2.setName("Selección de Volleyball");

        System.out.println(team1);
        System.out.println(team2);

    }
}
