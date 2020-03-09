package practicums.practicum8;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp,double pr, int jr, int fnr){
        super(tp, pr, jr );
        framenummer = fnr;
    }

    public double huidigeWaarde(){
        int leeftijd = LocalDate.now().getYear() - this.bouwjaar;
        double huidigeprijs = this.nieuwprijs;
        for (int i = 1; i == leeftijd; i++){
            huidigeprijs = huidigeprijs * 0.90;
        }
        return huidigeprijs;
    }
    public boolean equals(Object obj){
        boolean flag = false;
        if (obj instanceof Fiets){
            Fiets andereFiets = (Fiets) obj;
            if (this.framenummer == andereFiets.framenummer){
                flag = true;
            }
        }
        return flag;
    }

}
