import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the operation ( +,-,*,/) :");
         int operation = input.nextInt();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        if (operator.equals("+")) {
	result = number1 + number2;

	System.out.println("result: "+ result);
	
        } else if (operator.equals("-")) {
	result = number1 - number2;
	
	system.out.println("result: "+ result);

	} if (operator.equals("*")) {
	result = number1 * number2;
	System.out.println("result: "+ result); 
  
	} else if (operator.equals("/")) {
	} if (number2 == 0) {

	System.out.println("Error: cannot divide by zero.");
  	
	} else {
	result = number1 / number2;

        System.out.println("Result: "+ result);
	}
	
        

   	 }
		}