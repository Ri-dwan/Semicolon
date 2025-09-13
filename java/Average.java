import java.util.Scanner;

  public class Average {
   public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
  
   System.out.print("Enter the v1: "); 
   double v1 = input.nextDouble();   				
   
   System.out.print("Enter the v2: ");
   double v2 = input.nextDouble();

   System.out.print("Enter the time: ");
   double time = input.nextDouble();
  
   double av = (v1 - v2) /time;

   System.out.printf("Average acceleration is %d",av);

     }
 }