import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

     RollerCoaster rollerCoaster;

    @Before
    public void before() {
        rollerCoaster = new RollerCoaster(5, 12, 150);
    }

    @Test
    public void canGetPrice() {
        assertEquals(5, rollerCoaster.getPrice());
    }

    @Test
    public void canGetMinimumAge() {
        assertEquals(12, rollerCoaster.getMinimumAge());
    }

    @Test
    public void canGetMinimumHeight(){
        assertEquals(150, rollerCoaster.getMinimumHeight());
    }
}
