package practicums.practicum3B;

public class Main {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        // voor de test
        // als ik de try catch zou verwijderen zou compileert de code niet meer.
        // na de test:
        // Exception in thread "main" java.lang.IllegalArgumentException: Radius moet groter dan 0 zijn!
        // at practicums.practicum3B.Cirkel.<init>(Cirkel.java:13)
        // at practicums.practicum3B.Main.main(Main.java:9)
        System.out.println(c1);
        System.out.println(c2);
    }
}