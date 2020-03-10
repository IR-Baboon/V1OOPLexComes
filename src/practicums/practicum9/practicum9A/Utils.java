package practicums.practicum9.practicum9A;

public class Utils {
    public static String euroBedrag(double bedrag, int precisie){

        String pre = "%.2f";
        if (precisie == 0){
            pre = "%."+precisie+"f";
        }
        String bdr = String.format("%.2f", bedrag);
        return "€ " + bdr;

    }

}
