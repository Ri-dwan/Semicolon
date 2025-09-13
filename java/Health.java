import java.util.Scanner;

  public class Health {
   public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
  
   System.out.print("Enter the weight in pounds: ");
   double pounds = input.nextDouble();

    System.out.print("Enter the height in inches: ");
    double inches = input.nextDouble();

	double convertToPounds = pounds * 0.45359237;
	double convertToHeight = inches * 0.0254;
   
	double bmi = convertToPounds/( convertToHeight * convertToHeight);
 	  System.out.print( "bmi is " + bmi);

     }
 }