import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jeff on 1/4/17.
 */
public class Extraction {

    /**
     * Take an input string and extract all phone numbers, add them to the list, and return the list
     * @param input
     * @return
     */
    public List<String> extractPhoneNumbers(String input){
        List<String> phones = new ArrayList<String>();
        Pattern p = Pattern.compile("\\(\\d{3}\\)\\s\\d{3}-\\d{4}");
        Matcher m = p.matcher(input);

        while (m.find()){
            phones.add(m.group());
        }

        return phones;
    }

    /**
     * Extract all href urls from the input
     * @param input
     * @return
     */
    public List<String> extractUrls(String input){
        List<String> urls = new ArrayList<String>();
        Pattern p = Pattern.compile("(?:href=\")([\\w:/.]+)");
        Matcher m = p.matcher(input);

        while (m.find()){
            urls.add(m.group(1));
        }

        return urls;
    }

    /* **************************************************
     * Hard Mode
     * **************************************************/

    /**
     * Take an input string and extract all email addresses out of the input string and add them to the list then
     * return the list
     * @param input
     * @return
     */
    public List<String> extractEmails(String input){
        List<String> emails = new ArrayList<String>();
        Pattern p = Pattern.compile("\\s(\\w+(?:\\.\\w+)?@\\w+\\.\\w+)\\s");
        Matcher m = p.matcher(input);

        while (m.find()){
            emails.add(m.group(1));
        }


        return emails;
    }

}
