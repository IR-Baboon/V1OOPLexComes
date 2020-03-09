package practicums.practicum7;

import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        processen = new ArrayList<OpmaakProces>();
    }
    public String verwerk(String input){
        String s1 = input;
        for (OpmaakProces proces : processen){
            s1 = proces.maakOp(s1);
        }
        return s1;
    }
    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }
}
