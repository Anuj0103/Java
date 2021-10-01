//Write an application that accepts two doubles as its commandline arguments, multiple these together and display the product

package Lab2;

public class prog4 {

 public static void main(String[] args) {
  int product;
  int a = Integer.parseInt(args[0]);
  int b = Integer.parseInt(args[1]);
  product = a * b;
  System.out.println("The product is " + product);
 }
}