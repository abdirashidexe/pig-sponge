import java.util.ArrayList;
import java.util.List;

public class Pig {

    /*
     * Create a method "pigLatin" that takes a string consisting of one or more
     * all-lowercase words separated by spaces. It should return a new string
     * converted to "pig Latin," where each word has its first letter moved to
     * the back and the letters "ay" are added to the end of the word. However,
     * words starting with a vowel (a, e, i, o, or u) should not be altered.
     *
     * Examples:
     *
     * pigLatin("something") should return "omethingsay"
     * pigLatin("awesome") should return "awesome" (words starting with a vowel
     * should not be altered)
     * pigLatin("latin is a hard language") should return
     * "atinlay is a ardhay anguagelay"
     * pigLatin("y") should return "yay"
     * pigLatin("e") should return "e"
     */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence) {
        List<String> wordsInSentence = new ArrayList<String>();

        if (sentence.contains(" "))
        {
            for (int k = 0; k < sentence.length(); k++)
            {
                if (sentence.charAt(k) == ' ')
                {
                    return "space location found"; // I want to take the entire word before the space and put it in an ArrayList
                                                   // I could use sentence.charAt(0) to charAt(k) but what about the 2nd word? I cant use charAt(0)
                                                   // because loop is still going
                }
            }
            return "contains space";
        }

        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentence.charAt(0) == 'a' || sentence.charAt(0) == 'e' || sentence.charAt(0) == 'i' || sentence.charAt(0) == 'o' || sentence.charAt(0) == 'u')
            {
                return sentence;
            }

            sentence += sentence.charAt(0) + "ay"; // something + s + ay = somethingsay
            sentence = sentence.substring(1); //                      omethingsay
            return sentence;
        }
        return sentence;
    }

    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
            System.out
                    .println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
            System.out.println("Test " + testNumber + " passed!");
        }
    }
}
