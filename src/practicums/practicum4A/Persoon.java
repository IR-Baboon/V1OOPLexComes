package practicums.practicum4A;

public class Persoon {
    private String naam;
    private Integer leeftijd;

    public Persoon(String nm, Integer lft){
        naam = nm;
        leeftijd = lft;
    }

    public String toString() {
        return naam + "; leeftijd: " + leeftijd;
    }
}
