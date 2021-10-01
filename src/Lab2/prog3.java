//WAP to check whether the input year is leap or not

package Lab2;

import java.util.Scanner;

public class prog3 {
    static boolean checkYear(int year)
    {
        // If a year is multiple of 400,
        // then it is a leap year
        if (year % 400 == 0)
            return true;
     
        // Else If a year is multiple of 100,
        // then it is not a leap year
        if (year % 100 == 0)
            return false;
     
        // Else If a year is multiple of 4,
        // then it is a leap year
        if (year % 4 == 0)
            return true;
        return false;
    }
         
    // Driver method
    public static void main(String[] args)
    {
         int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any year:");
        n = s.nextInt();
        System.out.println( checkYear(n)? "Leap Year" :
                           "Not a Leap Year" );
    }
}