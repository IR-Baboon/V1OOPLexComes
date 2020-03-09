package practicums.practicum7;

import java.util.List;

public class VervangProces implements OpmaakProces {
    private String oud;
    private String nieuw;

    public VervangProces(String oud, String nieuw){
        this.oud = oud;
        this.nieuw = nieuw;
    }
    public String maakOp(String input){
        String s1 = input;
        String result = s1.replaceAll(oud, nieuw);
        return result;
    }
}
