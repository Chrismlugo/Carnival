import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBigWheel {
    BigWheel bigWheel;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        bigWheel = new BigWheel("Big Wheel", 4.00, 8, 10);
    }

    @Test
    public void hasName() {
        assertEquals("Big Wheel", bigWheel.getName());
    }

    @Test
    public void hasPrice() {
        assertEquals(4.00, bigWheel.getPrice(), 0.01);
    }

    @Test
    public void hasCapacity() {
        assertEquals(8, bigWheel.getCapacity());
    }

    @Test
    public void testCanAddCustomer() {
        Customer customer = new Customer("Stimpy", 10.00, 24);
        bigWheel.add(customer);
        assertEquals(1, bigWheel.countCustomers());
    }

    @Test
    public void testCantAddCustomerOverCapacity() {
        Customer customer = new Customer("Ren", 5.00, 28);
        Customer customer2 = new Customer("Stimpy", 10.00, 24);
        bigWheel.add(customer);
        bigWheel.add(customer);
        bigWheel.add(customer);
        bigWheel.add(customer);
        bigWheel.add(customer2);
        bigWheel.add(customer2);
        bigWheel.add(customer2);
        bigWheel.add(customer2);
        assertEquals(8, bigWheel.countCustomers());
        bigWheel.add(customer2);
        assertEquals(8, bigWheel.countCustomers());
    }

    @Test
    public void canCheckForSpaceOnRide() {
        Customer customer = new Customer("Ren", 5.00, 28);
        Customer customer2 = new Customer("Stimpy", 10.00, 24);
        bigWheel.add(customer);
        bigWheel.add(customer);
        bigWheel.add(customer);
        bigWheel.add(customer);
        bigWheel.add(customer2);
        assertEquals(3, bigWheel.checkForSpace());
    }

    @Test
    public void testCantAddIfTooYoung(){
        Customer customer = new Customer("James", 2.00, 8);
        bigWheel.add(customer);
        assertEquals(0, bigWheel.countCustomers());
    }

    @Test
    public void testCustomerCanPayToRide(){
        Customer customer = new Customer("Lauren", 12.00, 14);
             bigWheel.add(customer);
             assertEquals(8.00, customer.getCash(), 0.01 );
    }

    @Test
    public void testCustomerIsAtTheTopOfTheWheel(){

        assertEquals("Whoooo!!", bigWheel.action());
    }

    @Test
    public void testHasQueue() {
        assertEquals(0, bigWheel.countCustomersInQueue());
    }
}
