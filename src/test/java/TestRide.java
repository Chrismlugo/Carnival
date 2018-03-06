import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRide {
    Ride ride;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        ride = new Ride("Big Wheel", 4.00, 8, 10);
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
        Customer customer = new Customer("Stimpy", 10.00, 24, 4);
        ride.add(customer);
        assertEquals(1, ride.countCustomers());
    }

    @Test
    public void testCantAddCustomerOverCapacity() {
        Customer customer = new Customer("Ren", 5.00, 28, 3);
        Customer customer2 = new Customer("Stimpy", 10.00, 24, 4);
        ride.add(customer);
        ride.add(customer);
        ride.add(customer);
        ride.add(customer);
        ride.add(customer2);
        ride.add(customer2);
        ride.add(customer2);
        ride.add(customer2);
        assertEquals(8, ride.countCustomers());
        ride.add(customer2);
        assertEquals(8, ride.countCustomers());
    }

    @Test
    public void canCheckForSpaceOnRide() {
        Customer customer = new Customer("Ren", 5.00, 28, 4);
        Customer customer2 = new Customer("Stimpy", 10.00, 24, 5);
        ride.add(customer);
        ride.add(customer);
        ride.add(customer);
        ride.add(customer);
        ride.add(customer2);
        assertEquals(3, ride.checkForSpace());
    }

    @Test
    public void testCantAddIfTooYoung(){
        Customer customer = new Customer("James", 2.00, 8, 5);
        ride.add(customer);
        assertEquals(0, ride.countCustomers());
    }
}
