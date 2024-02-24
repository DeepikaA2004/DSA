import java.io.*;
import java.util.*;

class UserMainCode3 {
    public static int nthFibonacci(int input1) {
        if (input1 == 1) {
            return 0;
        } else if (input1 == 2) {
            return 1;
        } else if (input1 == 3) {
            return 1;
        } else {
            return nthFibonacci(input1 - 1) + nthFibonacci(input1 - 2);
        }
    }

    public static void main(String[] args) {
        int num, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        result = nthFibonacci(num);
        System.out.println(result);

    }
}