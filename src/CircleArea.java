import java.util.*;
public class CircleArea {
 public static void main(String[] args){

	final double pi = Math.PI;
	System.out.println("Input the radius: ");
	Scanner scan = new Scanner( System.in );
	double radius = scan.nextInt();
	System.out.println("The radius is: " + radius);
	System.out.println("The area is: " + (pi * Math.pow(radius, 2)));
 
 }
}
