import java.util.Scanner;

public class Balance {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	 System.out.print("Enter your account balance:");
	 double balance = scanner.nextDouble();

	 if (balance < 100){
         System.out.println("Low");
	 }
	 else if (balance >= 100 && balance <= 15){
	 System.out.println("Cold");
         }
	 else if (balance > 16 && balance <= 1000){
	 System.out.println("Medium");
	 }
	 else 
	 {
	 System.out.println("High");
	 }

	   }
		}
		
