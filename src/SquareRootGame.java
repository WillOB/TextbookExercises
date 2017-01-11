import java.util.*;

public class SquareRootGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random rand = new Random();
		System.out.println("How many rounds? ");
		int rounds = scan.nextInt();
		System.out.println("First player, sign in--> ");
		String p1 = scan.nextLine();
		System.out.println("Second player, sign in--> ");
		String p2 = scan.nextLine();
		
		int round = 1;
		int p1Wins = 0;
		int p2Wins = 0;
		while (round <= rounds) {
			double num = rand.nextDouble()*100;
			System.out.println("\n\nWhat is the square root of " + num + "?");
			double guess1, guess2;
			if (round%2 == 1){
				System.out.println(p1 + ", your guess: ");
				guess1 = scan.nextDouble();
				System.out.println(p2 + ", your guess: ");
				guess2 = scan.nextDouble();
			}
			else {
				System.out.println(p2 + ", your guess: ");
				guess2 = scan.nextDouble();
				System.out.println(p1 + ", your guess: ");
				guess1 = scan.nextDouble();
			}
			System.out.println("The correct square root: " + Math.sqrt(num));
			double diff1 = Math.abs(Math.sqrt(num) - guess1);
			double diff2 = Math.abs(Math.sqrt(num) - guess2);
			System.out.println(p1 + " is " + diff1 + " away.");
			System.out.println(p2 + " is " + diff2 + " away.");
			if (diff1 < diff2) {
				System.out.println(p1 + " wins!");
				p1Wins++;
			}
			else if (diff2 < diff1) {
				System.out.println(p2 + " wins!");
				p2Wins++;
			}
			round++;
		}
		System.out.println("\n\n---- Final Score ----\n" + p1 + ": " + p1Wins + "   " + p2 + ": " + p2Wins);
		
	}

}
