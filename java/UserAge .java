 // prompt a user for their age and categorize them into a specific group.

import java.util.Scnner;

public class UserAge {
	public static void main(String[] arge) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter your age:");
	int age = Scanner.nextInt();

	 if ( age >=0 && age <=12){
         else System.out.print("Child");
	 }

	 else ( age >=13 && age <=19){
	 System.out.print("Teen");
         }

	 else (age >=20 && age <=59){
	 System.out.print("Adult");
	 }
		
         else (age >=60 && <==){
         Syste.out.print("Senior");
	 }
  	   }

		}



