package practicums.practicum6A;

import java.util.ArrayList;
import java.util.Locale;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    public Persoon(String nm, double bdg){
        naam = nm;
        budget = bdg;
        mijnGames = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        for (Game game : mijnGames) {
            if (g.equals(game)) {

                return false;
            }
        }
        if (budget > g.huidigeWaarde()) {
            budget = budget - g.huidigeWaarde();
            mijnGames.add(g);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (mijnGames.contains(g)) {
            if (!koper.mijnGames.contains(g)) {
                if (koper.budget >= g.huidigeWaarde()) {
                    koper.budget = koper.budget - g.huidigeWaarde();
                    mijnGames.remove(g);
                    koper.mijnGames.add(g);
                    budget = budget + g.huidigeWaarde();
                    return true;
                }
            }
        }
        return false;
    }

    public String toString(){
        String Bbudget = String.format("%.2f", budget);
        String s =  naam + " heeft een budget van €" +Bbudget + " en bezit de volgende games:";
        for (Game game : mijnGames){
            s = s + "\n" + (game);
        }
        return s;
    }
}
