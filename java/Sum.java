import java.util.Scanner;

public class Sum {
   public static void main(String[] args) {
   Scanner input = new Scanner (System.in);
 	
     System.out.print("Enter the first integer: ");
     int number1 = input.nextInt();
  	
      System.out.print("Enter the second integer: ");
      int number2 = input.nextInt();

      int sum = number1 + number2;
      System.out.printf("sum of %d + %d is %d",number1,number2,sum );
	}
  }


  