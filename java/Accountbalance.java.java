import java.util.Scanner;

public class Accountbalance {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	 System.out.print("Enter your account balance:");
	 int balance = Scanner.nextDouble();

	 if ( Balance < 100){
         System.out.println("Low");
	 }
	 else if ( Balance >= 100 && Balance <= 15){
	 System.out.println("Cold");
         }
	 else if (Balance > 16 && Balance <= 100){
	 System.out.println("Medium");
	 }

	 else ( Balance > 1000 ){
        
	 System.out.println("High");
	 }

	   }
		}
		
