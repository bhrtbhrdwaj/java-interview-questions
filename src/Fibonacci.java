import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 5. Write a Java program to print a Fibonacci sequence using recursion.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Integer maxLimit = 10;
       System.out.println(getFibonacciSeries(10));
    }
    public static List<Integer> getFibonacciSeries (Integer maxLimit) {
        List<Integer> fibonacciSeries = new ArrayList<>();
        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 1; i <= maxLimit; i++) {
            fibonacciSeries.add(a);
            a = b;
            b = c;
            c = a + b;
        }
    return fibonacciSeries;
    }

}