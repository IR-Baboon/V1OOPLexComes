package practicums.Practicum2B;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VoetbalclubTest {

    @Test
    public void testBeginstandIsNul() {
        Voetbalclub vtblclub = new Voetbalclub("FC");

        vtblclub.aantalPunten();
        assertEquals(0, vtblclub.aantalPunten(), "test niet geslaagd");
    }

    @Test
    public void testNaamLeeg() {
        Voetbalclub vtblclub = new Voetbalclub("");

        vtblclub.getNaam();
        assertEquals("FC", vtblclub.getNaam(), "test niet geslaagd");
    }

    @Test
    public void testWinstBoeken(){
        Voetbalclub vtblclub = new Voetbalclub("");

        vtblclub.verwerkResultaat('w');
        vtblclub.getAantalGewonnen();
        vtblclub.aantalPunten();
        assertEquals(3, vtblclub.aantalPunten(), "punten niet goed");
        assertEquals(1, vtblclub.getAantalGewonnen(), "aantal gewonnen niet goed");

    }

    @Test
    public void testGelijkspelBoeken(){
        Voetbalclub vtblclub = new Voetbalclub("");

        vtblclub.verwerkResultaat('g');
        vtblclub.getAantalGelijk();
        vtblclub.aantalPunten();
        assertEquals(1, vtblclub.aantalPunten(), "punten niet goed");
        assertEquals(1, vtblclub.getAantalGelijk(), "aantal gewonnen niet goed");

    }
    @Test
    public void testVerliesBoeken(){
        Voetbalclub vtblclub = new Voetbalclub("");

        vtblclub.verwerkResultaat('v');
        vtblclub.getAantalVerloren();
        vtblclub.aantalPunten();
        vtblclub.aantalGespeeld();
        assertEquals(0, vtblclub.aantalPunten(), "punten niet goed");
        assertEquals(1, vtblclub.getAantalVerloren(), "aantal gewonnen niet goed");
        assertEquals(1, vtblclub.aantalGespeeld(), "aantal gespeeld niet goed");
    }
    @Test
    public void testfoutieveInvoer(){
        Voetbalclub vtblclub = new Voetbalclub("h");

        vtblclub.verwerkResultaat('d');
        vtblclub.getAantalVerloren();
        vtblclub.aantalPunten();
        vtblclub.aantalGespeeld();
        vtblclub.getNaam();
        assertEquals("h", vtblclub.getNaam(), "naam niet geslaagd");
        assertEquals(0, vtblclub.aantalPunten(), "punten niet goed");
        assertEquals(0, vtblclub.getAantalVerloren(), "aantal gewonnen niet goed");
        assertEquals(0, vtblclub.aantalGespeeld(), "aantal gespeeld niet goed");
    }

    @Test
    public void testherhaaldeInvoer(){
        Voetbalclub vtblclub = new Voetbalclub("");

        vtblclub.verwerkResultaat('w');
        vtblclub.verwerkResultaat('v');
        vtblclub.verwerkResultaat('g');
        vtblclub.verwerkResultaat('w');
        vtblclub.verwerkResultaat('w');
        vtblclub.verwerkResultaat('g');
        vtblclub.getAantalVerloren();
        vtblclub.aantalPunten();
        vtblclub.aantalGespeeld();
        assertEquals(11, vtblclub.aantalPunten(), "punten niet goed");
        assertEquals(3, vtblclub.getAantalGewonnen(), "aantal gewonnen niet goed");
        assertEquals(2, vtblclub.getAantalGelijk(), "aantal gelijk niet goed");
        assertEquals(1, vtblclub.getAantalVerloren(), "aantal gewonnen niet goed");
        assertEquals(6, vtblclub.aantalGespeeld(), "aantal gespeeld niet goed");
    }





}