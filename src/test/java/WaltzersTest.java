import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaltzersTest {

    Waltzers waltzers;

    @Before
    public void before() {
        waltzers = new Waltzers(6, 8, 120, 100);
    }

    @Test
    public void canGetPrice() {
        assertEquals(6, waltzers.getPrice());
    }

    @Test
    public void canGetMinimumAge() {
        assertEquals(8, waltzers.getMinimumAge());
    }

    @Test
    public void canGetMinimumHeight(){
        assertEquals(120, waltzers.getMinimumHeight());
    }

    @Test
    public void canGetIncome(){

        assertEquals(106, waltzers.income(6));
    }

    @Test
    public void allowedOnRide(){
        assertEquals(true, waltzers.rideHeight(160));
    }
}


