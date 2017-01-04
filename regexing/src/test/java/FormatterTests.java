import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeff on 1/4/17.
 */
public class FormatterTests {

    Formatter f = new Formatter();

    @Test
    public void testPhoneFormatter(){
        assertEquals("(123) 456-7890", f.formatPhone("1234567890"));
        assertEquals("(123) 456-7890", f.formatPhone("123.456.7890"));
        assertEquals("(123) 456-7890", f.formatPhone("123 456 7890"));
        assertEquals("(123) 456-7890", f.formatPhone("123 456-7890"));
    }
}
