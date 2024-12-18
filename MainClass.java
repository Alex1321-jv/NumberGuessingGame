package Main;

import java.util.Random;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Random randomguess= new Random();
		Scanner scan=new Scanner(System.in);
		
		int randomguessint=randomguess.nextInt(100)+1;
		
		
		System.out.println("Welcome to the Number Guessing game!!");
		System.out.println("Today we are going to choose a number between 1 and 100. Can you guess it?");
		
		int guess=0;
		int attempts=0;	
		final int maxattempts=6;
		while(guess!=randomguessint) {
			
			System.out.print("Please enter your guess between 1-100:");
			
			if(scan.hasNextInt()) {
					guess=scan.nextInt();				
					if(guess<1 || guess>100) {
						System.out.println("Out of bounds! Please select a number accordingly.");
						continue;
					}
			attempts++;
			
				   if(guess<randomguessint) {
				
					   System.out.println("Too low! Try again!");
					   
				   }
				   else if (guess>randomguessint) {
					   
					   System.out.println("Too high! Try again!");
					   
				   }
				   else {
					   System.out.println("Congratulations! You guessed the number in "+attempts+" attempts.");
				   }
				  
				   
			
			 if(attempts>=maxattempts) {
					System.out.println("You have surpassed the number of allowed  guesses. Good luck next time!");
					break;
				}	
		
			}else {
				System.out.print("Invalid input! Please tell me a number between 1 and 100:");
				scan.next();
			}
		}	
		
		scan.close();			
		
	}

}
