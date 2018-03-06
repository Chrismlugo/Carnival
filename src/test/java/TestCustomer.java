import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomer {
    Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("Bill", 20.00, 16);
    }

    @Test
    public void getCash() {
        assertEquals(20.00, customer.getCash(), 0.01);
    }

    @Test
    public void getName() {
        assertEquals("Bill", customer.getName());
    }

    @Test
    public void getAge() {
        assertEquals(16, customer.getAge());
    }
}
