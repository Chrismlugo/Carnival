import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRide {
    Ride ride;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        ride = new Ride("Big Wheel", 4.00, 8);
    }

    @Test
    public void hasName() {
        assertEquals("Big Wheel", ride.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(4.00, ride.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity() {
        assertEquals(8, ride.getCapacity());
    }

    @Test
    public void testCanAddCustomer() {
        Customer customer = new Customer("Stimpy", 10.00, 24);
        ride.add(customer);
        assertEquals(1, ride.countCustomers());
    }
}
