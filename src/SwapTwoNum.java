import static java.lang.System.out;
/**
 * 2. How do you swap two numbers without using a third variable in Java?
 */
public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        out.println("Before swapping a = " + a + " and b = " + b);
        /*int temp = 0;
        temp = a + b;
        b = a;
        a = temp - a;
        */
        a = (a + b);
        b = (a - b);
        a = (a - b);
        out.println("After swapping a = " + a + " and b = " + b);
    }
}