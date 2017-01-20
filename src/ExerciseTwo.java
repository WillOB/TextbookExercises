import java.util.Scanner;
public class ExerciseTwo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter N");
		int N = reader.nextInt();
		int count = 0;
		double sum = 0.0;
		for (count = 1; count <= N; count++){
			sum = sum + 1.0 / count;
		}
		System.out.println("Sum is: " + sum);
		
	}

}
