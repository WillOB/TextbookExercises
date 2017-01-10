import java.util.Scanner;
public class AddingIntegers {

	public static void main(String[] args) {
		System.out.println("How many integers will be added: ");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int count = 0;
		int sum = 0;
		while(count < num){
			System.out.println("Enter an integer: ");
			int add = reader.nextInt();
			sum = sum + add;
			count++;
		}
		System.out.println("The sum is " + sum);

	}

}
