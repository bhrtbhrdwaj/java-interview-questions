import java.util.ArrayList;
import java.util.List;

/**
 * 7. How do you check whether a string is a palindrome in Java?
 */
public class Palindrome {
    public static void main(String[] args) {
       String str = "nitin";
        System.out.println(isPalindrome(str));
    }
/*
    boolean result = true;
    int length = input.length();

	for (int i = 0; i < length/2; i++) {
        if (input.charAt(i) != input.charAt(length - i - 1)) {
            result = false;
            break;
        }
    }
*/

    private static boolean isPalindrome(String str) {
        char[] strChars = str.toCharArray();
        for (int i = 0, j = strChars.length - 1; i != j; i++) {
            if (strChars[i] != strChars[j])
                return false;
            j--;
        }
        return true;
    }
}