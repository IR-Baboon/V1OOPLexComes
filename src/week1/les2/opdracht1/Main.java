package week1.les2.opdracht1;

import week1.les2.opdracht1.Piloot;

public class Main {
    public static void main(String[] arg) {
        Piloot p1 = new Piloot("lex");
        p1.setSA(123456.78);
        System.out.println("Zonder vlieguren: " + p1.toString());
        p1.verhoogVliegurenMet(12);
        System.out.println("Eerste piloot: " + p1);
        System.out.println();

        Piloot p2 = new Piloot("Leonardo di Caprio");
        p2.setSA(5000.00);
        p2.verhoogVliegurenMet(3);
        System.out.println("Vlieguren van tweede piloot: "+ p2.getVU());
        System.out.println("Salaris van tweede piloot: " + p2.getSA());
        System.out.println("Tweede piloot: " + p2);
    }
}
