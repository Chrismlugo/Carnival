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
    public void throwPie() {
        assertEquals("Splat!", clown.throwPie());
    }
}
