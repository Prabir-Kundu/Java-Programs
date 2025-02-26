//Swap two numbers without using a third variable.

public class Swap_Two_Numbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Before: a = "+a+",b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After: a = "+a+",b = "+b);
    }
}
