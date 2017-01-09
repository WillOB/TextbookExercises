import java.util.*;
public class Dollars {

	public static void main(String[] args) {
		System.out.println("Input the cents: ");
		Scanner scan = new Scanner( System.in );
		int cents = scan.nextInt();
		int dollars = cents / 100;
		int remainder = cents % 100;
		System.out.println("That is " + dollars + " dollars and " + remainder + " cents.");

	}

}
