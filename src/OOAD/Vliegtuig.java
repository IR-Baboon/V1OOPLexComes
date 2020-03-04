package OOAD;

import java.util.Calendar;

public class Vliegtuig {
    private String naam;
    private Calendar datumInGebruik;
    private Luchtvaartmaatschappij lvm;
    private Vliegtuigtype isVanType;

    public Vliegtuig(Luchtvaartmaatschappij lvm){
        this.lvm = lvm;
    }

    private void zetIsVanType(Vliegtuigtype isVanType) {
        this.isVanType = isVanType;
    }
    private void geefDatumInGebruik(){ //Calendar

    }
    public void bewaar(){

    }
}
