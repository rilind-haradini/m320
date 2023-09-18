

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Projekte.D1_Auftrag.Time;
import org.junit.jupiter.api.Test;

public class TimeTest {

    @Test
    public void testNextSecond() {
        Time t1 = new Time(23, 59, 58);
        assertEquals("23:59:58", t1.toString());

        t1.nextSecond();
        assertEquals("23:59:59", t1.toString());

        t1.nextSecond().nextSecond();
        assertEquals("00:00:01", t1.toString());
    }

    @Test
    public void testInvalidTime() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            Time t2 = new Time(25, 61, 70);
        });
        assertEquals("Stunde muss zwischen 0 und 23 sein.", exception.getMessage());
    }
}
