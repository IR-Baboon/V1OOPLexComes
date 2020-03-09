package practicums.practicum8;

import java.util.ArrayList;

public class Bedrijfsinventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public Bedrijfsinventaris(String nm, double bud){
        this.bedrijfsnaam = nm;
        this.budget = bud;
        alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed g){
        boolean flag = true;
        for (Goed goed : alleGoederen){
            if (goed.equals(g)){
                flag = false;
            }
        }
        if (flag == true){
            if (budget > g.huidigeWaarde()){
                alleGoederen.add(g);
                budget = budget - g.huidigeWaarde();
            }
        }

    }

    public String toString(){
        String s1 = "";
        for (Goed g : alleGoederen){
            s1 = s1 + g.toString() + "\n";
        }
        return s1;
    }
}
