//Write an application that accepts one command line argument,display the line of reporting if number is even or odd.

package Lab2;

public class prog5 {

  // Function to the check Even or Odd
    public static int isEvenOrOdd(int num)
    {
        return (num % 2);
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Check if length of args array is
        // greater than 0
        if (args.length > 0) {
  
            // Get the command line argument and
            // Convert it from string type to integer type
            int num = Integer.parseInt(args[0]);
  
            // Get the command line argument
            // and check if it is even or odd
            int res = isEvenOrOdd(num);
  
            // Check if res is 0 or 1
            if (res == 0)
                // Print Even
                System.out.println("Even\n");
            else
                // Print Odd
                System.out.println("Odd\n");
        }
        else
            System.out.println("No command line "
                               + "arguments found.");
    }
}