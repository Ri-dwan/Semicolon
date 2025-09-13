import java.util.Scanner;
		public class Try{
		public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number from 0-5:");
   		int digit = input.nextInt();

		if (digit ==1){
		System.out.print("One");	
                }

		else if(digit==2){
		System.out.print("Two");
		}

		else if(digit==3){
		System.out.print("Three");
		}

		else if(digit==4){
		System.out.print("Four");
		}

		else if(digit==5){
		System.out.print("Five");
		}

	        else{

		System.out.print("Invalid");
                }

    }
	}
		 