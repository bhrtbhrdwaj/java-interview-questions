import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 6. How do you check if a list of integers contains only odd numbers in Java?
 */
public class ListContainsOnlyOdd {
    public static void main(String[] args) {
     /*   IntStream nums = IntStream.rangeClosed(1, 10);
        System.out.println(nums.allMatch(num -> num % 2 != 0));
    */
    int[] numArr = {3, 5, 2, 7};
    System.out.println(containsAllOdd(numArr));

    }
    public static boolean containsAllOdd(int[] numArr) {
        boolean areAllOdd = true;
        for (int i = 0; i < numArr.length; i++) {
            if ((numArr[i] % 2) == 0)
                return false;
        }
        return areAllOdd;
    }
}