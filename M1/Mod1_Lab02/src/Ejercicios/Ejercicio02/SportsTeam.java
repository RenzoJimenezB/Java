package Ejercicios.Ejercicio02;

public class SportsTeam {
    private String country;
    private String sport;
    private String name;
    private int numberOfPlayers;

    public SportsTeam(String country, String sport, String name, int numberOfPlayers) {
        this.country = country;
        this.sport = sport;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public String toString() {
        return "SportsTeam{" +
                "country='" + country + '\'' +
                ", sport='" + sport + '\'' +
                ", name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                '}';
    }

}
