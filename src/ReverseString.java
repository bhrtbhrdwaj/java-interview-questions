/**
 * 1. How do you reverse a string in Java?
 */
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello world!";
        char[] charArray = str.toCharArray();
        StringBuffer reverse = new StringBuffer("");
        for (int i = charArray.length - 1; i >= 0;  i--)
            reverse.append(charArray[i]);
        System.out.println(reverse);
    }
}