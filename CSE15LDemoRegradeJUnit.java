import static org.junit.Assert.*;
import org.junit.*;

public class CSE15LDemoRegradeJUnit {
    
    
    @Test
    public void testMultiply() {
        assertEquals(3,CSE15LDemoRegrade.multiplyTwoInts(1, 3));
    }
}
