
import java.util.Scanner;

public class CostofDriving {
      public static void main(String[] args){  
      Scanner input = new Scanner (System.in);
 
      System.out.print("Enter the distance: ");
      double distance = input.nextDouble();

      System.out.print("Enter the miles : ");
      double miles = input.nextDouble();

      System.out.print(" Enter the price gallon: ");
      double price = input.nextDouble();

      double cost = distance * miles / price;

      System.out.println(distance * price / miles);
  
       }
   } 
