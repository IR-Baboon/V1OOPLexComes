package practicums.practicum5;

public class Leerling {
    private String naam;
    private double cijfer = 0;

    public Leerling(String nm){
        naam = nm;
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String toString() {
        return naam;
    }
}
