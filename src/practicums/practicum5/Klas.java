package practicums.practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String kC){
        klasCode = kC;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling ll){
        leerlingen.add(ll);
    }

    public void wijzigCijfer(String nm, double nweCijfer){
        for (Leerling leerling : leerlingen){
            if (nm == leerling.getNaam()){
                leerling.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }
    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    public String toString() {
        String s = "In klas " + klasCode + " zitten de volgende leerlingen:\n";
        for (Leerling leerling : leerlingen){
            String s2 = leerling.getNaam() + " heeft cijfer: " + leerling.getCijfer() + "\n";
            s = s + s2;
        }
        return s;
    }
}
  