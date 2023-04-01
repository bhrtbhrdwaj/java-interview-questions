import java.util.ArrayList;
import java.util.List;

/**
 * 8. How do you remove spaces from a string in Java?
 */
public class RemoveSpace {
    public static void main(String[] args) {
        String str = " hello world ";
        System.out.println(removeSpace(str));
    }
    public static String removeSpace(String str) {
        String str_ = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') continue;
            str_ += str.charAt(i);
        }
        return str_;
    }
    public static String removeWhiteSpaces(String input) {
        StringBuilder output = new StringBuilder();
        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (!Character.isWhitespace(c))
                output.append(c);
        }
        return output.toString();
    }
}