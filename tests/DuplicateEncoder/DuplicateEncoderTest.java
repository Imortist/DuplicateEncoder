package DuplicateEncoder;

import org.junit.Test;

import static org.junit.Assert.*;



/**
Encode any String with following logic:
if letter duplicates replace it with (
if letter does not duplicate replace it with )

*/

public class DuplicateEncoderTest {

        @Test
        public void test() {
            assertEquals(")()())()(()()(", DuplicateEncoder.encode("Prespecialized"));
            assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
        }

        @Test
    public void testDuplicates(){
            assertFalse( DuplicateEncoder.getDuplicates("Prespecialized").isEmpty());
        }
}