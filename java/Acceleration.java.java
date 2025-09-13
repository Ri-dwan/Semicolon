import java.util.Scanner;

    public class Acceleration {
    public static void main(String[] args) {
    
     Scanner input = new Scanner (System.in);
 
     System.out.print("Enter take off-speed2: ");
     double speed1 = input.nextDouble();

      System.out.print("Enter take off-speed2: ");
      double speed2 = input.nextDouble();

     System.out.print(" Enter time in secs:");
     double time = input.nextDouble();

     double acceleration = speed1 - speed2 / time;

     System.out.println("Average acceleration is:",acceleration);
  
       }
   } 
