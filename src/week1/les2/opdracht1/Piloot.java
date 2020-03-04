package week1.les2.opdracht1;

import javax.swing.plaf.ViewportUI;
import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Piloot {
    private String naam;
    private Integer vlieguren;
    private Double salaris;

    public Piloot(String nm) {
        naam = nm;
    }

    public Double getSA(){
        return salaris;
    }

    public Integer getVU(){
        return vlieguren;
    }

    public void setSA(Double sa){
        salaris = sa;
    }

    public void verhoogVliegurenMet(Integer vu){
        vlieguren = vu;
    }

    public String toString(){
        String s = "Piloot: " + naam + "\nSalaris: " + salaris + "\nVlieguren: " + vlieguren;
        return s;
    }
}
