import java.util.Scanner;

        public class Miniapp {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome to your personal assistant.");


        System.out.println("How old are you? ");
        int age = scanner.nextInt();

	
        System.out.println("How are you feeling today (happy, sad, excited, or tired)?");
        String mood = scanner.next();


        if (mood.equals("happy")) {
            System.out.println("Keep smiling!");    
        }
       else if(mood.equals("sad")) {
            System.out.println("Cheer up! Tomorrow is a new day.");
	}
         else if (mood.equals("excited")) {
            System.out.println("Awesome! Enjoy your energy!");    
        }
        else if (mood.equals("tired")) {
            System.out.println("Rest well and recharge!");
	} 
        System.out.println("Guess a number between 1 and 10.");
         int guess = scanner.nextInt();
	
        if (guess == 7) {
            System.out.println("Wow! You guessed it!");
        }
         else  {
            System.out.println("Try again next time!");
        }
	
    


        System.out.println("Do you want a suggestion for the day? (yes/no)");
	
	String want = scanner.next();
        
        
        if (want.equals("yes")) {
            System.out.println("No worries ! Have a great day anyway!");
        }
        else if(want.equals("no")) {
            System.out.println("Go out and play any sport you like!");
         }


	
	  if (age < 13) {
            System.out.println("You are a young explorer!");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("Teen life is fun, enjoy it!");
        }
       else if (age >= 20 && age <= 59) {
            System.out.println("Adulting can be challenging, stay strong!");
        }
        else if (age >= 60) {
            System.out.println("Wisdom looks good on you!");
        }
    



              }
                }

                   