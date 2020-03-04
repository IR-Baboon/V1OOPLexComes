package practicums.practicum2A;

public class Zwembad {
    private Double breedte;
    private Double lengte;
    private Double diepte;

    public Zwembad(){
    }

    public Zwembad(Double br, Double lng, Double di){
        breedte = br;
        lengte = lng;
        diepte = di;
    }
    public Double getBreedte(){
        return breedte;
    }
    public Double getLengte(){
        return lengte;
    }
    public Double getDiepte(){
        return diepte;
    }
    public void setBreedte(Double br){
        breedte = br;
    }
    public void setLengte(Double lng){
        lengte = lng;
    }
    public void setDiepte(Double di){
        diepte = di;
    }
    public Double inhoud(){
        return lengte * breedte * diepte;
    }
    public String toString(){
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        return s;
    }
}
