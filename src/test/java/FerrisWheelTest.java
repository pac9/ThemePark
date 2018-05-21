import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FerrisWheelTest {

    FerrisWheel ferrisWheel;

    @Before
    public void before() {
        ferrisWheel = new FerrisWheel(8, 10, 130);
    }

    @Test
    public void canGetPrice() {
        assertEquals(8, ferrisWheel.getPrice());
    }

    @Test
    public void canGetMinimumAge() {
        assertEquals(10, ferrisWheel.getMinimumAge());
    }

    @Test
    public void canGetMinimumHeight(){
        assertEquals(130, ferrisWheel.getMinimumHeight());
    }
}


