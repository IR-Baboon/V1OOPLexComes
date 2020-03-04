package practicums.Practicum2B;

public class Main {
    public static void main(String[] args) {
        Voetbalclub ajx = new Voetbalclub("Ajax      ");
        Voetbalclub fey = new Voetbalclub("Feijenoord");

        fey.verwerkResultaat('w');
        fey.verwerkResultaat('w');
        fey.verwerkResultaat('w');
        fey.verwerkResultaat('g');

        System.out.println("Feijenoord punten: " + fey.aantalPunten());
        System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
        System.out.println();

        System.out.println(ajx);
        System.out.println(fey);
    }
}
