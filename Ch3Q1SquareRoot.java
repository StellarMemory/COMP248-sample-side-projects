import java.util.Scanner;

public class Ch3Q1SquareRoot {

	public static void main(String[] args) {
		//Babylonian Algorithm
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a positive number n: ");
		double n = keyboard.nextDouble();
		double guess, lastGuess, r;
		
		guess = n/4;
		
		do 
		{
			r = n/guess;
			lastGuess = guess;
			guess = (guess+r)/2;
			System.out.println(guess);
		}
		while (Math.abs(lastGuess-guess)/lastGuess>=0.01);
		
		System.out.printf("\n%.2f", guess);
		keyboard.close();
	}

}
