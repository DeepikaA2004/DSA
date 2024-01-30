public class MultiSwap {
    public static void main(String args[]) {

        // Various Methods to swap two variables

        int a = 10;
        int b = 30;

        System.out.println("[BEFORE SWAPPING] The value of a is " + a + " & value of b is " + b);

        /*
         * Method 1 - We use third variable (temp) to swap two variables
         * int temp = a;
         * a = b;
         * b = temp;
         */

        /*
         * Method 2 - We use operators like + and -
         * a = a+b; // a = 10 + 30 => 40
         * b = a-b; // b = 40 - 30 => 10
         * a = a-b; // a = 40 - 10 => 30
         */

        /*
         * Method 3 - We use operators like * and /
         * a = a*b; // a = 10 * 30 => 300
         * b = a/b; // b = 300/30 => 10
         * a = a/b; // a = 300 / 10 => 30
         * 
         */

        // Method 4 - We use XOR Operators

        /*
         * TRUE-FALSE
         * true xor true => false
         * true xor false => true
         * false xor true => true
         * false xor false => false
         * 
         * 1-0
         * 1 xor 1 => 0
         * 1 xor 0 => 1
         * 0 xor 1 => 1
         * 0 xor 0 => 0
         * 
         */

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // Method 5 - Use an Inbuilt Method for swapping i.e swap(4,3);
        System.out.println("[AFTER SWAPPING] The value of a is " + a + " & value of b is " + b);

    }
}