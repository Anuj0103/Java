//Write a program that creates and initializes a four-element int array. Calculate and display the average of its values.

package Lab3;

import java.util.Scanner;

public class prog2 {
  public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        var arr=new int[4];
        float avg;

        System.out.println("Enter the array");
        for(int i=0;i<4;i++)
            arr[i]=sc.nextInt();

        sc.close();   

        float sum=0;    
        for(int i=0;i<4;i++)
            sum+=arr[i];
            
        avg=sum/4;
        System.out.print(avg);
        
        
    }
}
