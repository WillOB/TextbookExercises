import java.util.Scanner;
public class ApplianceCost {

	public static void main(String[] args) {
		System.out.println("Enter cost per kilowatt-hour in cents: ");
		Scanner scan = new Scanner(System.in);
		double cost = scan.nextDouble();
		System.out.println("Enter kilowatt-hours used per year: ");
		double hours = scan.nextDouble();
		System.out.println("Annual cost: $" + (cost * hours / 100));

	}

}
