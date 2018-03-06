import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHauntedHouse {
    HauntedHouse hauntedHouse;
    Customer customer;

    @Before
    public void setUp() throws Exception {
        hauntedHouse = new HauntedHouse("Horror house of terror", 5.00, 6, 12, 5);

    }

    @Test
    public void testCustomerGetsScare() {

        assertEquals("Boooo!!!", hauntedHouse.action());
    }
}
