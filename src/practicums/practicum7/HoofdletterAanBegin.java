package practicums.practicum7;

public class HoofdletterAanBegin implements OpmaakProces{

    public HoofdletterAanBegin(){

    }

    public String maakOp(String input){
        String s2 = "";
        if(input == null || input.isEmpty()) {
            return input;
        }
        String[] begin = input.split("[.]");
        for (String s : begin){
            s = s.strip();
            String s1 = s.substring(0, 1).toUpperCase() + s.substring(1);
            s2 = s2 + s1 + ". ";
        }


        return s2;
    }
}
