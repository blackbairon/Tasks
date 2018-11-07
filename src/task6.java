import java.util.Scanner;

//Print number that the user entered
public class task6 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Insert the number");
        int a=sc.nextInt();
        sc.close();
        System.out.println("Entered the number"+a);
    }
}
