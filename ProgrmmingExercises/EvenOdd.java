// Indicate if a number is even or odd
import java.util.Scanner;

public class EvenOdd
{
   public static void main(String args[])
   {
      int num;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt();
      if((num % 2 == 0))
         System.out.println(num + " is an even number");
      else
         System.out.println(num + " is an odd number");
   }

}