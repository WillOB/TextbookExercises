import java.util.*;
public class FallingBrick {

	public static void main(String[] args) {
		final double g = 32.174;
		System.out.println("Enter the number of seconds: ");
		Scanner scan = new Scanner(System.in);
		double seconds = scan.nextDouble();
		double distance = 1.0 / 2 * g * Math.pow(seconds, 2);
		System.out.println("Distance (ft): " + distance);

	}

}
