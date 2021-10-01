package Lab1;

//. Swapping two numbers using bitwise operator
import java.util.Scanner;

public class prog5 {
 public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no: ");
        a=sc.nextInt();
        System.out.print("Enter second no: ");
        b=sc.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("First no: "+a);
        System.out.print("\nSecond no: "+b);
       
        sc.close(); 
 }
}
