import java.util.Scanner;

public class Grade {
	public static void main(String[] arge) {
	Scanner Scanner = new Scanner(System.in);

	System.out.print("Enter your grade:");
	String grade = Scanner.nextInt();

	 if ( grade == 'A'|| grade =='B'||grade =='C'||grade =='D'){
         System.out.println("Pass");
	 }

         else if ( grade == F ){
	 System.out.println("Fail");
         }
	 else {
	 System.out.println("Invalid");
         }

	   }
		}
		

