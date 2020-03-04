package practicums.practicum2A;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    void testBerekendeInhoud(){
        Zwembad z = new Zwembad(10.0, 10.0, 10.0);

        z.inhoud();
        assertEquals(1000, z.inhoud(), "berekende inhoud functie klopt niet");
    }
}