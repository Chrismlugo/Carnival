import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRingmaster {
    RingMaster ringMaster;

    @Before
    public void setUp() throws Exception {
        ringMaster = new RingMaster("Papa Lazarou");
    }

    @Test
    public void hasName() {
        assertEquals("Papa Lazarou", ringMaster.getName());
    }
}
