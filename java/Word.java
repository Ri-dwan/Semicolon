import java.util.Scanner;
	public class Word{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a number from 0-9: ");
			int digit = input.nextInt();
			
			if (digit == 1){
            		System.out.print("One");
			}
			else if (digit == 2){
			System.out.print("Two");
			}
			else if(digit == 3){
			System.out.print("Three");
			}
			else if(digit == 4){
			System.out.print("Four");
			}
			else if(digit == 5){
			System.out.print("Five");
			}
			else if(digit ==6){
			System.out.print("Six");
			}
			else if(digit == 7){
			System.out.print("Seven");
			}
			else if(digit == 8){
			System.out.print("Eight");
			}
			else if(digit == 9){
			System.out.print("Nine");
			}
			else{
			System.out.print("Invalid! enter a number between 0-9");
			}










}


	}