package practicums.practicum1;

public class opdracht5 {
    public static void main(){
        String text = "s";
        System.out.println(text);
        for(int i = 1; i<11 ; i++){
            if (text == "s") {
                text = text + "s";
            } else {
                text = "s";
            }
            System.out.println(text);
        }
    }
}
