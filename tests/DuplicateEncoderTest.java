import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {

    @Test
    public void encode1() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
    }

    @Test
    public void encode2(){
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}