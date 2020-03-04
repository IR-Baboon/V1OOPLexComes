package week1.les1.opdracht3;

public class Main {
    public static void main(String[] arg){
        Student S1 = new Student("lex", 1234);

        System.out.println(S1.getNaam());
        System.out.println(S1.getSTNR());
        System.out.println(S1.toString());
        S1.setNaam("broekie");
        System.out.println(S1.getNaam());
        System.out.println(S1.toString());
        S1.setSTNR(56789);
        System.out.println(S1.getSTNR());
        System.out.println(S1.toString());
    }
}
