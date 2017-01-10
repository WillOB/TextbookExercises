import java.util.Scanner;
public class ExerciseTwo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter N");
		int N = reader.nextInt();
		int count = 1;
		double sum = 0.0;
		while (count <= N){
			sum = sum + 1.0 / count;
			count++;
		}
		System.out.println("Sum is: " + sum);
		
	}

}
