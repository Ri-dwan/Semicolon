import java.util.Scanner;

   public class Annuallnterest {
   public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
  
   System.out.print("Enter the interest:"); 
   double interest = input.nextDouble();   				
   
   System.out.print("Enter the balance: ");
   double balance = input.nextDouble();
  
   double annuallnterest = balance * (interest/1200);

   System.out.printf("The annual lnterest is %.5f%n ", annuallnterest);

     }
 }