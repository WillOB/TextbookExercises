import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
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
			else
				System.out.println("wrong");
		}
		if (guess == num)
			System.out.println("You have won the game.");
		else
			System.out.println("You have lost the game.");
	}

}
