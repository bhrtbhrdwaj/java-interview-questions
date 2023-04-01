import java.util.ArrayList;
import java.util.List;

/**
 * 9. How do you remove leading and trailing spaces from a string in Java?
 *
 * The String class contains two methods to remove leading and trailing whitespaces:
 * trim() and strip(). The strip() method was added to the String class in Java 11.
 * The strip() method uses the Character.isWhitespace() method to check if the character is a whitespace.
 * This method uses Unicode code points, while the trim() method identifies any character with a codepoint value less than or equal to U+0020 as a whitespace character.
 * The strip() method is the recommended way to remove whitespaces because it uses the Unicode standard. The following example code shows how to use the strip() method to remove whitespaces:
 */
public class RemoveLeadingTrailingSpace {
    public static void main(String[] args) {
       String str = " hello ";
       System.out.println(trim(str));
    }
    public static String trim(String str) {
        StringBuilder trimmedStr = new StringBuilder("");
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                continue;
            trimmedStr.append(chars[i]);
        }
        return trimmedStr.toString();
    }

}