import java.util.Random;
import java.util.Scanner;

public class FurtherImprovedGuessingGame {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		int game = 1;
		int gamesWon = 0;
		while (game <= 10) {
			int num = rand.nextInt(10) + 1;
			int guess = 0;
			int count = 1;
			System.out.println("I am thinking of a number from 1 to 10.\nYou must guess what it is in three tries.");
			while (guess != num && count <= 3) {
				System.out.println("Enter a guess: ");
				guess = reader.nextInt();
				count++;
				if (guess == num)
					System.out.println("RIGHT!");
				else if (Math.abs(num - guess) >= 3)
					System.out.println("cold");
				else if (Math.abs(num - guess) == 2)
					System.out.println("warm");
				else if (Math.abs(num - guess) == 1)
					System.out.println("hot");
			}
		
		if (guess == num)
			gamesWon++;
		
		System.out.println("You have won " + gamesWon + " out of " + game + " games.");	
		game++;
		}
		String rating;
		if (gamesWon <= 7)
			rating = "amateur";
		else if (gamesWon == 8)
			rating = "advanced";
		else if (gamesWon == 9)
			rating = "professional";
		else
			rating = "hacker";
		
		System.out.println("Your rating: " + rating);
	}

}
