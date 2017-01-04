import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by jeff on 1/4/17.
 */
public class ValidationTest {

    Validation v = new Validation();

    @Test
    public void testBinaryNumber(){
        assertTrue(v.binary("0"));
        assertTrue(v.binary("1"));
        assertTrue(v.binary("01"));
        assertTrue(v.binary("10"));
        assertTrue(v.binary("1110100010"));
        assertFalse(v.binary(""));
        assertFalse(v.binary("911"));
    }

    @Test
    public void testBinaryEven(){

        assertTrue(v.binary_even("10"));
        assertTrue(v.binary_even("1110100010"));
        assertFalse(v.binary_even("1011"));
    }

    @Test
    public void testHexadecimal(){
        assertTrue(v.hexadecimal("CAFE"));
        assertTrue(v.hexadecimal("9F9"));
        assertTrue(v.hexadecimal("123"));
        assertTrue(v.hexadecimal("6720EB3A9D1"));
        assertFalse(v.hexadecimal(""));
        assertFalse(v.hexadecimal("COFFEE"));
    }

    @Test
    public void testWord(){
        assertTrue(v.word("hello"));
        assertTrue(v.word("wonderful"));
        assertTrue(v.word("zyggon"));
        assertTrue(v.word("horse-dagger"));
        assertTrue(v.word("18-wheeler"));
        assertFalse(v.word(""));
        assertFalse(v.word("12"));
        assertFalse(v.word("!!!"));
        assertFalse(v.word("bar*us"));
    }

    @Test
    public void testPhone(){
        assertTrue(v.phone_number("919-555-1212"));
        assertTrue(v.phone_number("(919) 555-1212"));
        assertTrue(v.phone_number("9195551212"));
        assertTrue(v.phone_number("919.555.1212"));
        assertTrue(v.phone_number("919 555-1212"));
        assertFalse(v.phone_number(""));
        assertFalse(v.phone_number("555-121"));
        assertFalse(v.phone_number("1212"));
        assertFalse(v.phone_number("mobile"));
    }

    @Test
    public void testZip(){
        assertTrue(v.zipCode("63936"));
        assertTrue(v.zipCode("50583"));
        assertTrue(v.zipCode("48418"));
        assertTrue(v.zipCode("06399"));
        assertTrue(v.zipCode("26433-3235"));
        assertTrue(v.zipCode("64100-6308"));
        assertFalse(v.zipCode(""));
        assertFalse(v.zipCode("7952"));
        assertFalse(v.zipCode("115761"));
        assertFalse(v.zipCode("60377-331"));
        assertFalse(v.zipCode("8029-3924"));
    }

    public void testEmail(){
        assertTrue(v.email("stroman.azariah@yahoo.com"));
        assertTrue(v.email("viola91@gmail.com"));
        assertTrue(v.email("eathel.west@example.org"));
        assertTrue(v.email("dwehner@harley.us"));
        assertTrue(v.email("malcolm.haley@hotmail.com"));
        assertTrue(v.email("ezzard90@hotmail.com"));
        assertTrue(v.email("legros.curley@gmail.com"));
        assertTrue(v.email("leatha75@mertz.net"));
        assertTrue(v.email("bonita43@yahoo.com"));
        assertFalse(v.email(""));
        assertFalse(v.email("legros.curley"));
        assertFalse(v.email("mertz.net"));
        assertFalse(v.email("bonita43@"));
    }

    public void testAddress(){
        assertTrue(v.address("368 Agness Harbor\nPort Mariah, MS 63293"));
        assertTrue(v.address("96762 Juluis Road Suite 392\nLake Imogenemouth, AK 20211"));
        assertTrue(v.address("671 Tawnya Island Apt. 526\nClementeburgh, AK 82652"));
        assertTrue(v.address("568 Eunice Shoals\nParishaven, AK 09922-2288"));
        assertTrue(v.address("8264 Schamberger Spring, Jordanside, MT 98833-0997"));

        assertFalse(v.address(""));
        assertFalse(v.address("99132 Kaylah Union Suite 301"));
        assertFalse(v.address("Lake Joellville, NH"));
        assertFalse(v.address("35981"));
    }
}
