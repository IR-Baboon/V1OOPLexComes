package practicums.practicum4B;

public class AutoHuur {
    private Integer aantalDagen = 0;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur() {
    }

    public void setAantalDagen(Integer aD) {
        aantalDagen = aD;
    }

    public void setGehuurdeAuto(Auto gA) {
        gehuurdeAuto = gA;
    }

    public void setHuurder(Klant k) {
        huurder = k;
    }

    public Integer getAantalDagen() {
        return aantalDagen;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public Double totaalPrijs() {
        Double totaal = aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - (huurder.getKorting() / 100));
        return totaal;
    }

    public String toString() {
        String sHuurder = "\ner is geen huurder bekend";
        String sAuto = "er is geen auto bekend";
        String sBerekening = "\naantal dagen: " + aantalDagen + " en dat kost: 0.0";
        if ( huurder != null) {
            sHuurder = "\nop naam van: " + huurder.toString();
        }
        if (gehuurdeAuto != null) {
            sAuto = "Autotype: " + gehuurdeAuto.toString();
            sBerekening = "\naantal dagen: " + aantalDagen + " en dat kost: " + totaalPrijs();
        }
        return sAuto + sHuurder + sBerekening ;
    }
}

