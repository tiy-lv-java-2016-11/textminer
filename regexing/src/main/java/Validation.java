import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jeff on 1/4/17.
 */
public class Validation {

    /**
     * Test if the string is binary (Only 0 or 1)
     * @param input
     * @return
     */
    public boolean binary(String input){
        Pattern p = Pattern.compile("[01]+");
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**
     * Test whether input is binary and even
     * @param input
     * @return
     */
    public boolean binary_even(String input){
        Pattern p = Pattern.compile("[01]+0$");
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**
     * Test if the input is a hexadecimal (0 - 9 or A, B, C, D, E, F)
     * @param input
     * @return
     */
    public boolean hexadecimal(String input){
        Pattern p = Pattern.compile("[A-F0-9]+");
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**
     * Test if input contains only word characters
     * @param input
     * @return
     */
    public boolean word(String input){
        Pattern p = Pattern.compile("\\d*[A-z-]+");
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**
     * Tests for valid US phone numbers
     * @param input
     * @return
     */
    public boolean phone(String input){
        Pattern p = Pattern.compile("(?:\\(?(\\d{3})\\)?[-\\s.]?)?(\\d{3})[-\\s.]?(\\d{4})");
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**
     * Test to see if the input is a valid us postal code
     * @param input
     * @return
     */
    public boolean zipCode(String input){
        Pattern p = Pattern.compile("\\d{5}(-\\d{4})?$");
        Matcher m = p.matcher(input);
        return m.matches();
    }

    /**************************************************************
     * HARD MODE
     **************************************************************/


    /**
     * Test to see if the input is a valid email address
     * @param input
     * @return
     */
    public boolean email(String input){
        return true;
    }

    /**
     * This must be a full address with street number, street, city, state, and ZIP code. Again, US-only.
     * @param input
     * @return
     */
    public boolean address(String input){
        return true;
    }
}
