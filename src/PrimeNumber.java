import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Objects;

/**
 * 4. Write a Java program to check if the given number is a prime number.
 */
public class PrimeNumber {
    public static void main(String[] args) {
       Integer num = 49;
        System.out.println(isPrime(num));
    }
    public static boolean isPrime(Integer num) {
        if (Objects.isNull(num))
            return false;
        if (num < 0 || num.equals(0) || num.equals(1))
            return false;
        for (int i = 2; i <= num / 2; i++) {    //sqrt()
            if ((i % 2) == 0)
                return false;
        }
    return true;
    }
}