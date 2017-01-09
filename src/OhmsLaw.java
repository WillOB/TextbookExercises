import java.util.Scanner;
public class OhmsLaw {

	public static void main(String[] args) {
		System.out.println("Enter voltage: ");
		Scanner scan = new Scanner(System.in);
		int voltage = scan.nextInt();
		System.out.println("Enter resistance: ");
		int resistance = scan.nextInt();
		System.out.println("The current is " + (voltage + 0.0) / resistance + " amps.");

	}

}
