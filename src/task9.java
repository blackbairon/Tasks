//The program displays the reverse number specified by the user
import java.util.Scanner;

public class task9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=-sc.nextInt();
        sc.close();
        System.out.println("Reverse number is"+a);
    }
}
