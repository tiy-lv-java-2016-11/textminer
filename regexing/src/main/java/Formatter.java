import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jeff on 1/4/17.
 */
public class Formatter {

    /**
     * Takes a phone input extracts parts and formats as (XXX) XXX-XXXX
     * @param input
     * @return
     */
    public String formatPhone(String input){
        Pattern p = Pattern.compile("(\\d{3})[\\s.\\-]?(\\d{3})[\\s.\\-]?(\\d{4})");
        Matcher m = p.matcher(input);
        m.find();

        return String.format("(%s) %s-%s", m.group(1), m.group(2), m.group(3));
    }

    

}
