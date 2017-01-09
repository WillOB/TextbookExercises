import java.util.Scanner;
public class CorrectChange {

	public static void main(String[] args) {
		System.out.println("Enter amount of money in cents: ");
		Scanner scan = new Scanner(System.in);
		int cents = scan.nextInt();
		int dollars = cents / 100;
		cents = cents - dollars * 100; 
		int quarters = cents / 25;
		cents = cents - quarters * 25;
		int dimes = cents / 10;
		cents = cents - dimes * 10;
		int nickels = cents / 5;
		cents = cents - nickels * 5;
		System.out.println("You get " + dollars + " dollars, " + quarters + " quarters, " + dimes + 
				" dimes, " + nickels + " nickels, and " + cents + " pennies.");

	}

}
