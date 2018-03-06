import org.junit.Before;

public class TestRide {
    Ride ride;

    @Before
    public void setUp() throws Exception {
        ride = new Ride("Big Wheel", 4.00, 8);
    }
}
