import java.util.*;
public class Base2Log {

	public static void main(String[] args) {
		System.out.println("Enter a double: ");
		Scanner scan = new Scanner(System.in);
		double num = scan.nextDouble();
		double log = Math.log(num) / Math.log(2);
		System.out.println("Base two log of " + num + " is " + log);

	}

}
