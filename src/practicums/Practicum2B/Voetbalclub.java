package practicums.Practicum2B;

public class Voetbalclub {
    private String naam;
    private Integer aantalGewonnen;
    private Integer aantalGelijk;
    private Integer aantalVerloren;


    public Voetbalclub(String nm){
        if (nm == null){
            nm = "FC";
        }
        if (nm == ""){
            nm = "FC";
        }
        naam = nm;
        aantalGewonnen = 0;
        aantalVerloren = 0;
        aantalGelijk = 0;
    }
    public Integer getAantalGewonnen(){
        return aantalGewonnen;
    }
    public Integer getAantalGelijk(){
        return aantalGelijk;
    }
    public Integer getAantalVerloren(){
        return aantalVerloren;
    }
    public String getNaam(){
        return naam;
    }
    public Integer aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }
    public Integer aantalPunten(){
        return (aantalGewonnen * 3) + (aantalGelijk);
    }
    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
        }
        if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
        }
        if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
        }
    }
    public String toString(){
        return naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
    }
}
