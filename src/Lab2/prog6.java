//Write an application that accepts radius of a circle as its command line argument display the area.

package Lab2;

public class prog6 {
 public static void main(String[] args) {

  if (args.length > 0) {
   int r = Integer.parseInt(args[0]);
   double area = 3.14 * r * r;
   System.out.println("Area of the circle is: " + area);
  }
  else {
     System.out.println("No command line "
                               + "arguments found.");
  }
 }
}
