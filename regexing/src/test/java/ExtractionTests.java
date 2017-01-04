import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeff on 1/4/17.
 */
public class ExtractionTests {

    private Extraction e = new Extraction();

    @Test
    public void testExtractPhoneNumbers(){
        String input = "Dear Mr. Davis, " +
                "I got to know of your company through our mutual friend Fiona Williams and the " +
                "training you offer to graduate students in Advertising. " +
                "I am a graduate student of Mass Communications with specialization in " +
                "Advertising.  I am currently pursuing the last year of my course. " +
                "I would very much like to see firsthand the work environment in an advertising " +
                "agency. " +
                "If you would like a reference, my advisor can be reached at (454) 999-1212. " +
                "You can contact me at (919) 123-4569 at your convenience.";
        List<String> phones = e.extractPhoneNumbers(input);
        assertEquals("(454) 999-1212", phones.get(0));
        assertEquals("(919) 123-4569", phones.get(1));
        assertEquals(phones.size(), 2);
    }

    @Test
    public void textExtractUrls(){
        String input = "<a href=\"https://www.reddit.com/r/LifeProTips/\" class=\"choice\" >LifeProTips</a></li>" +
                "<li ><span class=\"separator\">-</span><a href=\"http://foo.org/r/photoshopbattles/\" " +
                "class=\"choice\" >photoshopbattles</a></li><li ><span class=\"separator\">-</span>" +
                "<a href=\"https://www.reddit.com/r/nottheonion/\" class=\"choice\" >nottheonion</a></li>" +
                "<li ><span class=\"separator\">-</span><a href=\"https://www.reddit.com/r/explainlikeimfive/\" " +
                "class=\"choice\" >explainlikeimfive</a></li><li ><span class=\"separator\">-</span>" +
                "<a href=\"https://www.reddit.com/r/food/\" class=\"choice\" >food</a></li><li >" +
                "<span class=\"separator\">-</span><a href=\"https://www.reddit.com/r/books/\" class=\"choice\" >books</a>" +
                "</li><li ><span class=\"separator\">-</span><a href=\"https://www.reddit.com/r/creepy/\" " +
                "class=\"choice\" >creepy</a></li><li ><span class=\"separator\">-</span>" +
                "<a href=\"https://www.reddit.com/r/personalfinance/\" class=\"choice\" >personalfinance</a></li>" +
                "<li ><span class=\"separator\">-</span><a href=\"https://www.reddit.com/r/space/\" " +
                "class=\"choice\" >space</a></li><li ><span class=\"separator\">-</span>" +
                "<a href=\"https://www.reddit.com/r/TwoXChromosomes/\" class=\"choice\" >TwoXChromosomes</a></li>" +
                "<li ><span class=\"separator\">-</span><a href=\"https://www.reddit.com/r/GetMotivated/\" " +
                "class=\"choice\" >GetMotivated</a></li><li ><span class=\"separator\">-</span>" +
                "<a href=\"https://www.reddit.com/r/WritingPrompts/\" class=\"choice\" >WritingPrompts</a></li><li >" +
                "<span class=\"separator\">-</span><a href=\"https://www.reddit.com/r/science/\" " +
                "class=\"choice\" >science</a></li><li ><span class=\"separator\">-</span>" +
                "<a href=\"https://www.reddit.com/r/dataisbeautiful/\" class=\"choice\" >dataisbeautiful</a></li>" +
                "<li ><span class=\"separator\">-</span><a href=\"https://www.reddit.com/r/Art/\" " +
                "class=\"choice\" >Art</a></li><li ><span class=\"separator\">-</span><a " +
                "href=\"https://www.reddit.com/r/nosleep/\" class=\"choice\" >nosleep</a></li><li ><span " +
                "class=\"separator\">-</span><a href=\"https://www.reddit.com/r/askscience/\" " +
                "class=\"choice\" >askscience</a></li><li ><span class=\"separator\">-</span>" +
                "<a href=\"https://www.reddit.com/r/UpliftingNews/\" class=\"choice\" >UpliftingNews</a></li>";

        List<String> urls = e.extractUrls(input);
        assertEquals("https://www.reddit.com/r/LifeProTips/", urls.get(0));
        assertEquals("http://foo.org/r/photoshopbattles/", urls.get(1));
    }

    /* ******************************************
     * HARD MODE
     * ******************************************/

    @Test
    public void textExtractEmails(){
        String input = "Veggies es bonus vobis, proinde vos postulo essum magis kohlrabi " +
                "welsh onion daikon amaranth@gmail.com tatsoi tomatillo azuki bean garlic. " +
                "Gumbo beet greens corn soko endive gumbo gourd. Parsley shallot courgette " +
                "tatsoi pea@sprouts.org fava bean collard greens dandelion okra wakame " +
                "tomato. Dandelion cucumber.earthnut@pea.net peanut soko zucchini.";

        List<String> emails = e.extractEmails(input);
        assertEquals("amaranth@gmail.com", emails.get(0));
        assertEquals("pea@sprouts.org", emails.get(1));
        assertEquals("cucumber.earthnut@pea.net", emails.get(2));
    }
}
