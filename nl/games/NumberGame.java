package nl.games;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		int randomNumber = (int) (Math.random() * 100) + 1;
		boolean hasWon = false;
		
		System.out.println("I have randomly chosen a number between 1 and 100.");
		System.out.println("Try to guess it.");
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 7; i>0; i--) {
			System.out.println("You have " + i + " gues(ses) left.");
			int guess = scanner.nextInt();
			
			if(randomNumber < guess) {
				System.out.println("The number is smaller than " + guess + ". Choose again:");
			}
			else if(randomNumber > guess) {
				System.out.println("The number is bigger than " + guess + ". Choose again:");
			}
			else {
				hasWon = true;
				break;
			}
		}
			
			if(hasWon == true) {
				System.out.println("Correct! You win!");
			} else {
				System.out.println("You loose...");
				System.out.println("The number was " + randomNumber + ".");
			}
			
		scanner.close();
	}

}
