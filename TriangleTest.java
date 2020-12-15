package triangle;

import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input side a of the triangle:");
		double a = input.nextDouble();
		System.out.println("Input side b of the triangle:");
		double b = input.nextDouble();
		System.out.println("Input side c of the triangle:");
		double c =  input.nextDouble();
		
		input.nextLine();
		System.out.println("Colour of the triangle:");
        String colour = input.nextLine();
        System.out.println("Input if the triangle is filled: ture/falls");
		boolean isFilled = input.nextBoolean();
		
		Triangle triangle = new Triangle(a, b, c);
		triangle.setColour(colour);
		triangle.setFilled(true);
		System.out.println(triangle.printTriangle() + "\n" + triangle.getPerimeter()+ "\n"+triangle.getArea()+"\n" +triangle.getColour() + "\n" + triangle.isFilled());
		
	}

}
