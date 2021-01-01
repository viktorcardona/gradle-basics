package gradle.basics;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ApplicationTest {

    private Application subject = new Application();

    @Test
    public void testIsBlank_textIsNull_returnsTrue() {
        assertTrue("Text is not blank ", subject.isBlank(null));
    }

    @Test
    public void testIsBlank_textIsNotNull_returnsFalse() {
        assertFalse("Text is blank ", subject.isBlank("some_text"));
    }

}