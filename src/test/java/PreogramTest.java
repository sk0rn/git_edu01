import org.junit.Test;

import static org.junit.Assert.*;

public class PreogramTest {

    @Test
    public void testMethod() {
        assertEquals("some data", Program.method());
    }

    @Test
    public void testMethodArgX() {
        assertEquals("some data 5", Program.method(5));
        assertEquals("some data 100", Program.method(100));
        assertEquals("some data 88", Program.method(88));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodArgZeroX() {
        assertEquals("some data 5", Program.method(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMethodArgNegX() {
        assertEquals("some data 100", Program.method(-45));
    }


}
