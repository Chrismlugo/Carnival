import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHauntedHouse {
    HauntedHouse hauntedHouse;

    @Before
    public void setUp() throws Exception {
        hauntedHouse = new HauntedHouse("Horror house of terror", 5.00, 6, 12);

    }

    @Test
    public void testCanGetsScare() {

        assertEquals("Boooo!!!", hauntedHouse.action());
    }

    @Test
    public void testCustomerCanEnterHouse() {
        Customer customer = new Customer("Chris", 20.00, 26);
        hauntedHouse.add(customer);
        assertEquals(1, hauntedHouse.countCustomers());
        assertEquals(15.00, customer.getCash(), 0.01);
    }
}
