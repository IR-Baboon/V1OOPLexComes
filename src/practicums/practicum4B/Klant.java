package practicums.practicum4B;

public class Klant {
    private String naam;
    private double kortingsPercentage;

    public Klant(String nm){
        naam = nm;
    }

    public void setKorting(Double kP){
        kortingsPercentage = kP;
    }

    public Double getKorting(){
        return kortingsPercentage;
    }

    public String toString(){
        return naam + " (korting: " + kortingsPercentage + "%)";
    }
}
