import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBigTop {
    BigTop bigTop;

    @Before
    public void setUp() throws Exception {
        bigTop = new BigTop("Big Top", 5.00, 20, 6);
    }

    @Test
    public void action() {
        assertEquals("argh! the lion has eaten the lion tamer!", bigTop.action());
    }

    @Test
    public void testCanRemoveCustomers() {
        Customer customer = new Customer("Grant", 10.00, 16);
        bigTop.add(customer);
        bigTop.add(customer);
        bigTop.add(customer);
        bigTop.add(customer);
        bigTop.add(customer);
        bigTop.add(customer);
        bigTop.add(customer);
        bigTop.remove();
        assertEquals(0, bigTop.countCustomers());
    }
}
