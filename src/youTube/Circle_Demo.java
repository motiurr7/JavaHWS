package youTube;

import java.util.Scanner;

public class Circle_Demo {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		double radius, area;
		System.out.println("Enter radius: ");
		radius = inputScanner.nextDouble();
		
		area=3.1416*radius;
		System.out.println("Area of cirle" + area);
				
	}

}
