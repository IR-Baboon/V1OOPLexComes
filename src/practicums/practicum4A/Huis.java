package practicums.practicum4A;

public class Huis {
    private String adres;
    private Integer bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, Integer bwjr){
        adres = adr;
        bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb){
        huisbaas = hb;
    }

    public String getHuisbaas(){
        return huisbaas.toString();
    }

    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas: " + huisbaas.toString();
    }
}

