package practicums.practicum8;

import java.time.LocalDate;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    public double huidigeWaarde(){
        int leeftijd = LocalDate.now().getYear() - this.productieJaar;
        double huidigeprijs = this.aanschafPrijs;
        for (int i = 1; i == leeftijd; i++){
            huidigeprijs = huidigeprijs * 0.60;
        }
        return huidigeprijs;
    }
    public boolean equals(Object obj){
        boolean flag = false;
        if (obj instanceof Computer){
            Computer andereComputer = (Computer) obj;
            if (type == andereComputer.type){
                flag = true;
            }
        }
        return flag;
    }

    public String toString() {
        return "Computer: " + type + ", met bouwjaar " + productieJaar + " heeft een waarde van: " + huidigeWaarde();
    }
}
