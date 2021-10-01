package Lab1;

//WAP that convert string to character using toString() and valueOf()

public class prog2 {
 public static void main(String[] args) {
  String s = "Mountains";
  char[] charString = s.toCharArray();
  for (int i = 0; i < charString.length; i++) {
   
   System.out.print("'"+charString[i]+"'"+",");
  }
  }
}
