package practicums.practicum8;

import practicums.practicum9.practicum9A.Utils;

import java.time.LocalDate;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        bouwjaar = jr;
        nieuwprijs = pr;
    }
    public boolean equals(Object obj){
        return false;
    }
    public String toString(){
        return "Voertuig: " + type + ", met bouwjaar " + bouwjaar + " heeft een waarde van: " + Utils.euroBedrag(huidigeWaarde(), 2);
    }
}
