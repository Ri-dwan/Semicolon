import java.util.Scanner;

public class Temperature {
	public static void main(String[] arge) {
	Scanner Scanner = new Scanner(System.in);

	System.out.print("Temperature:");
	int Temperature = Scanner.nextInt();

	 if ( Temperature < 0){
         System.out.println("Freezing");
	 }

	 else if ( Temperature > 0 && Temperature <= 15){
	 System.out.println("Cold");
         }

	 else if (Temperature > 16 && Temperature <= 25){
	 System.out.println("Warm");
	 }

	 else{
	 System.out.println("Hot");
	 }

	   }
		}
		
