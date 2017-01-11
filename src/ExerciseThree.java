import java.util.Scanner;
public class ExerciseThree {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("How many numbers? >");
		int N = reader.nextInt();
		int count = 1;
		double sum = 0;
		double sqrSum = 0;
		while (count <= N) {
			System.out.println("Enter a number. >");
			double num = reader.nextDouble();
			sum = sum + num;
			sqrSum = sqrSum + num * num;
			count++;
		}
		double avgSquare = sqrSum / N;
		double avg = sum / N;
		double stdDev = Math.sqrt(avgSquare - avg * avg);
		System.out.println("The standard deviation is " + stdDev);
	}

}
