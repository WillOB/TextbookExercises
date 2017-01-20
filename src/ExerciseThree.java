import java.util.Scanner;
public class ExerciseThree {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many numbers? >");
		int N = reader.nextInt();
		int count;
		double sum = 0;
		double sqrSum = 0;
		for (count = 1; count <= N; count++) {
			System.out.println("Enter a number. >");
			double num = reader.nextDouble();
			sum = sum + num;
			sqrSum = sqrSum + num * num;
		}
		double avgSquare = sqrSum / N;
		double avg = sum / N;
		double stdDev = Math.sqrt(avgSquare - avg * avg);
		System.out.println("The standard deviation is " + stdDev);
	}

}
