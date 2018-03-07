import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClown {
    Clown clown;

    @Before
    public void setUp() throws Exception {
        clown = new Clown("Bobo");
    }

    @Test
    public void canThrowPieAtCustomer() {
        Customer customer = new Customer("Chris", 20.00, 26);
        assertEquals("Bobo throws pie at Chris...Splat!", clown.throwsPie(customer));
    }

    @Test
    public void canThrowPieAtClown() {
        Clown clown2 = new Clown("Rollo");
        assertEquals("Bobo throws pie at Rollo...Splat!", clown.throwsPie(clown2));

    }
}
