package week1.les1.opdracht3;

public class Student {
    private String naam;
    private Integer studentnummer;

    public Student(String nm, Integer stnr) {
        naam = nm;
        studentnummer = stnr;
    }

    public String getNaam() {
        return naam;
    }

    public Integer getSTNR(){
        return studentnummer;
    }

    public String toString() {
        String s = "mijn naam is " + naam + " en mijn studentnummer is: " + studentnummer;
        return s;
    }

    public void setNaam(String nwNaam){
        naam = nwNaam;
    }

    public void setSTNR(Integer nwNummer){
        studentnummer = nwNummer;
    }
}
