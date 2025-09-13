import java.util.Scanner;

  public class Convert {
   public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
  
   System.out.print("Enter the pounds: ");
   double pounds = input.nextDouble();
  
   double killogram  = pounds  *  0.454 ;
   System.out.print( killogram );

     }
 }