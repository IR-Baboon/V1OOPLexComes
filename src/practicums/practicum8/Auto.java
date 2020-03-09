package practicums.practicum8;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde(){
        int leeftijd = LocalDate.now().getYear() - this.bouwjaar;
        double huidigeprijs = this.nieuwprijs;
        for (int i = 1; i == leeftijd; i++){
            huidigeprijs = huidigeprijs * 0.70;
        }
        return huidigeprijs;
    }
    public boolean equals(Object obj){
        boolean flag = false;
        if (obj instanceof Auto){
            Auto andereAuto = (Auto) obj;
            if (this.kenteken == andereAuto.kenteken){
                flag = true;
            }
        }
        return flag;
    }

}
