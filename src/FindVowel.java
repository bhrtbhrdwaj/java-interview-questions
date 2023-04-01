/**
 * 3. Write a Java program to check if a vowel is present in a string.
 */
public class FindVowel {
    public static void main(String[] args) {
        final char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String str = "hogehnkwegoijwlfwoiugensdliuwoir;aldlasip";
        char[] strChars = str.toCharArray();
        for (int i = 0; i < strChars.length; i++) {
            char strChar = strChars[i];
            for (int j = 0; j < vowels.length; j++) {
                char vowel = vowels[j];
                if (vowel == strChar)
                    System.out.println(strChar);
            }
        }
        System.out.println(str.toLowerCase().matches(".*[aeiou].*"));
    }
}