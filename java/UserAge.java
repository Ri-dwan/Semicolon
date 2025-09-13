 // prompt a user for their age and categorize them into a specific group.


import java.util.Scanner;

public class UserAge {
	public static void main(String[] arge) {
	Scanner Scanner = new Scanner(System.in);

	System.out.print("Enter your age:");
	int age = Scanner.nextInt();

	 if ( age >= 0 && age <= 12){
         System.out.println("Child");
	 }

	 else if ( age >= 13 && age <= 19){
	 System.out.println("Teen");
         }

	 else if (age >= 20 && age <= 59){
	 System.out.println("Adult");
	 }

	 else if(age >= 60){
	 System.out.println("Senior");
	 }

	   }
		}
		


