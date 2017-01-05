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
    public boolean binary(String input) {
        Validation v = new Validation();
        Pattern p = Pattern.compile("[01]+");
        Matcher m = p.matcher(input);
        if (m.matches()) {
            m.find();
            if (m.find() == m.matches()) {}
                return true;

            } else {


                return m.matches();
            }
        }


    /**
     * Test whether input is binary and even
     * @param input
     * @return
     */
    public boolean binary_even(String input) {
        Validation v = new Validation();
        Pattern p = Pattern.compile("0$");
        Matcher m = p.matcher(input);
        if (m.matches()) {
            m.find();
            if (m.find() == m.matches()) {
                return true;
            } else {
                return m.matches();
            }
        }
    return m.matches();
    }


    /**
     * Test if the input is a hexadecimal (0 - 9 or A, B, C, D, E, F)
     * @param input
     * @return
     */
    public boolean hexadecimal(String input){
        return true;
    }

    /**
     * Test if input contains only word characters
     * @param input
     * @return
     */
    public boolean word(String input){
        return true;
    }

    /**
     * Tests for valid US phone numbers
     * @param input
     * @return
     */
    public boolean phone(String input){
        return true;
    }

    /**
     * Test to see if the input is a valid us postal code
     * @param input
     * @return
     */
    public boolean zipCode(String input){
        return true;
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
