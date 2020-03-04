package OOAD;

import java.util.ArrayList;
import java.util.TreeMap;

public class Luchtvaartmaatschappij {
    private String naam;
    private ArrayList<Vliegtuig> bezit;

    public Luchtvaartmaatschappij(String naam){
        this.naam = naam;
    }
    public void addVliegtuig(Vliegtuig vt){
        this.bezit.add(vt);
    }
    public void geefVliegtuigen(){ //TreeMap<String, Vliegtuig>

    }
}
