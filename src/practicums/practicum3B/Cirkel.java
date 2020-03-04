package practicums.practicum3B;

public class Cirkel {
    private Integer radius;
    private Integer xPositie;
    private Integer yPositie;

    public Cirkel(Integer rad, Integer x, Integer y) throws IllegalArgumentException{
        radius = rad;
        xPositie = x;
        yPositie = y;

        if(rad<=0) throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
    }
    public String toString(){
        String s = "Cirkel ("+ xPositie + ", " + yPositie + ") met radius: " + radius;
        return s;
    }
}
