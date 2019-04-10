// Display ascending and descending order of three integers
import java.util.Scanner;

public class AscendingAndDescending
{
   public static void main(String args[])
   {
      int num1;
      int num2;
      int num3;
      int temp;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first number: ");
      num1 = input.nextInt();
      System.out.print("Enter the second number: ");
      num2 = input.nextInt();
      System.out.print("Enter the last number: ");
      num3 = input.nextInt();

      // Ascending order
      System.out.print("Ascending Order: ");

      for (int i = 0; i < 2; i++) {
         if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
         }

         if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
         }
      }

      System.out.println(num1 + " " + num2 + " " + num3);


      // Descending order
      System.out.print("Descending Order: ");

      for (int i = 2; i > 0; i--) {
         if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
         }

         if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
         }
      }

      System.out.println(num1 + " " + num2 + " " + num3);
   }

}