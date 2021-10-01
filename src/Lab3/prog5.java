//Using the concept of method overloading Write method forcalculating the area of triangle ,circle and rectangle.

package Lab3;

import java.util.Scanner;

public class prog5 {
     public float area(int a,int b) {
        return (float)a*b;    }

    public float area(float r) {
            return (22*r*r/7); }

    public float area(float h,float b) {
                return h*b/2;      }     

    public static void main(String[] args) {
        
        prog5 ar=new prog5 ();
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("Enter choice of area (1-Triangle , 2-Circle , 3-Rectangle) ");
        ch=sc.nextInt();
        switch(ch){
            case 1:float h,b;
                System.out.print("Enter height and base of triangle: ");
                h=sc.nextFloat();  
                b=sc.nextFloat();
                System.out.println("Area of Traingle: "+ar.area(h,b));
                break;
            case 2:float r;
                System.out.print("Enter radius of circle: ");
                r=sc.nextFloat();
                System.out.println("Area of Circle: "+ar.area(r));
                break;
            case 3:int a,c;
                System.out.print("Enter length and breadth of triangle: ");
                a=sc.nextInt();
                c=sc.nextInt();
                System.out.println("Area of Rectangle: "+ar.area(a,c));          
                break;       
            }

        sc.close();    
    }
    
}
