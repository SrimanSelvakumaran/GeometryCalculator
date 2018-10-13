import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println("Welcome, " + name + ", to Geometry Calculator! \n"); // get name and welcome user
		//area of a triangle
		System.out.println("AREA OF A TRIANGLE \nPress enter to continue:");
		input.nextLine();
		System.out.println("Enter the measure of the base: ");
		double triBase = Double.parseDouble(input.nextLine());
		System.out.println("Enter the measure of the height: ");
		double triHeight = Double.parseDouble(input.nextLine());
		System.out.println("Enter the unit of measure: ");
		String triMeasure = input.nextLine();
		System.out.println("\nThe area of the triangle is " + 0.5*triBase*triHeight + " " + triMeasure + "^2.\n");
		
		//volume of a rectangular prism
		System.out.println("VOLUME OF A RECTANGULAR PRISM \nPress enter to continue:");
		input.nextLine();
		System.out.println("Enter the measure of the width: ");
		double recWidth = Double.parseDouble(input.nextLine());
		System.out.println("Enter the measure of the length: ");
		double recLength = Double.parseDouble(input.nextLine());
		System.out.println("Enter the measure of the height: ");
		double recHeight = Double.parseDouble(input.nextLine());
		System.out.println("Enter the unit of measure: ");
		String recMeasure = input.nextLine();
		System.out.println("\nThe area of the triangle is " + recWidth*recLength*recHeight + " " + recMeasure + "^3.");
		
		//solve quadratic equation (2 answers)
		System.out.println("QUADRATIC FORMULA \nPress enter to continue:");
		input.nextLine();
		System.out.println("Enter the value of A: ");
		double quadA = Double.parseDouble(input.nextLine());
		System.out.println("Enter the value of B: ");
		double quadB = Double.parseDouble(input.nextLine());
		System.out.println("Enter the value of C: ");
		double quadC = Double.parseDouble(input.nextLine());
		double quadSolution1 = (-quadB+Math.sqrt(quadB*quadB-4*quadA*quadC))/2*quadA;
		double quadSolution2 = (-quadB-Math.sqrt(quadB*quadB-4*quadA*quadC))/2*quadA;
		System.out.println("\nThe solution is " + quadSolution1 + " and " + quadSolution2 + ".");
		
	}

}
