package practicums.practicum4B;

public class Auto {
    private String type;
    private Double prijsPerDag;

    public Auto(String tp, Double prPD){
        type = tp;
        prijsPerDag = prPD;
    }

    public void setPrijsPerDag(Double prPD){
        prijsPerDag = prPD;
    }

    public Double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString(){
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
