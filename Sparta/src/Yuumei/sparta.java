package Yuumei;
import java.util.Scanner;

public class sparta {

	public static void main(String[] args) {
		int correct = 10000;
		int tries = 0;
		String msg;
		
		System.out.println("Leônidas wants to know if you know how many soldiers they will have to fight!");
		System.out.println("But you forgot because you were drinking too much last night!");
		System.out.println("Guess the corret amount to make him happy, but don't worry, he will tell if you are close.");
		System.out.println("Leônidas: So how many we will fight against?");
		
		Scanner input = new Scanner(System.in);
		
		int guess = input.nextInt();
		tries++;
		while (guess != correct)
		{
			
			msg = guess>correct?"Wrong! its less than that...":"Hahaha, what? Do you think that would even be a challenge? its more than that!";
			System.out.println(msg);
			guess = input.nextInt();
			tries++;
			
			/*if (guess > correct)
			{
				System.out.println("Wrong! its less than that...");
			}
			else if (guess < correct) 
			{
				System.out.println("Hahaha, what? Do you think that would even be a challenge? its more than that!");
			}
			*/
			
		}
		System.out.println("There you go! Yes 10000!");
		System.out.printf("You've guessed right in %d tries!",tries);
		

	}

}
