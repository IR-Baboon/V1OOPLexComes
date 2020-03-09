package practicums.practicum7;

public class HoofdletterProces implements OpmaakProces{
    public HoofdletterProces(){
    }

    public String maakOp(String input){
        String s1 = input;
        String result = s1.toUpperCase();
        return result;
    }
}
