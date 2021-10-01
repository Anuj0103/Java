//WAP to check Vowel or Consonant using Switch Case

package Lab2;

import java.util.Scanner;

public class prog1 {
 public static void main(String[] args) {
  String ch;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter an alphabet");
  ch = s.next();
  switch (ch) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
 }
}
