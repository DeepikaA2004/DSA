import java.util.Scanner;

public class SquarePattern {
    public static void main([] args) { 
 Scanner scanner = new ScannerSystem.in); System.out.print("Enter the size of the square matrix: ");
 int N = scanner.nextInt();
 
 System.out.println("Square shape matrix pattern:");
 for (int i = 1; i <= N; i++) {
 for (int j = 1; j <= N; j++) {
 
 System.out.print("* ");
 
 }
 System.out.println();
 }
 
 scanner.close();
 }
}