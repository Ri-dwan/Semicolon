
import java.util.Scanner;

public class Investment {
      public static void main(String[] args){  
      Scanner input = new Scanner (System.in);
 
      System.out.print("Enter the investment amount : ");
      double investmentamount = input.nextDouble();

      System.out.print("Enter the interest rate : ");
      double interestrate = input.nextDouble();

      System.out.print(" Enter the years: ");
      int years = input.nextInt();

      double futureinvestment = ( investmentamount *  interestrate *12 ) ;

      System.out.println("The accumulated value is");
  
       }
   } 