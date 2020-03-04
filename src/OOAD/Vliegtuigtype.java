package OOAD;

public class Vliegtuigtype {
    private String code;
    private int capaciteit;
    private Fabrikant fabrikant;

    public int geefCapaciteit(){
        return this.capaciteit;
    }

    public Vliegtuigtype(Fabrikant fabrikant, String code, int capaciteit){
        this.fabrikant = fabrikant;
        this.code = code;
        this.capaciteit = capaciteit;
    }

}
