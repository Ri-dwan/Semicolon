import java.util.Scanner;

   public class Annuallnterest {
   public static void main(String[] args) {
 
   Scanner input = new Scanner(System.in);
  
   System.out.print("Enter the interest: "); 
   double interest = input.nextDouble();   				
   
   System.out.print("Enter the balance: ");
   double balance = input.nextDouble();

   System.out.print("Enter the annuallintrest:1200 ");
   double annuallintrest = input.nextDouble();
  
   double annuallnetrest = (balance + interest ) /annuallnterest;

   System.out.print(annuallnterest );

     }
 }