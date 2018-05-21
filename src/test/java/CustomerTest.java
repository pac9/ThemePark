import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer(30, 160, 10);
    }

    @Test
    public void canGetAge() {
        assertEquals(30, customer.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(160, customer.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(10, customer.getMoney());
    }

    @Test
    public void canPayFayre(){

        assertEquals(5, customer.income(5));
    }

    @Test
    public void allowedOnRide(){
        assertEquals(true, customer.rideHeight(180));
    }
}
