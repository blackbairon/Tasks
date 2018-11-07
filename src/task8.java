//Different of two numbers
import java.util.Scanner;

public class task8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Sum is" + (a - b));
    }
}