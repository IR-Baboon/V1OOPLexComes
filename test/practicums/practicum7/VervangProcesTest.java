package practicums.practicum7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VervangProcesTest {
    private VervangProces proces;
    String input = "Hoe heeft hij dat gedaan?";

    @BeforeEach
    public void init() {
        VervangProces proces = new VervangProces("hij", "hij/zij");
    }

    @Test
    public void testmaakOp() {
        assertEquals("Hoe heeft hij/zij dat gedaan?", this.proces.maakOp(input), "test geslaagd");


        }

}