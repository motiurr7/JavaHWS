package youTube;


import java.util.Scanner;

public class traingle {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double base, height, area;
		System.out.println("Enter the base:");
		
		base = scanner.nextDouble();
		System.out.println("Print base" +base);
		
		height=scanner.nextDouble();
		System.out.println("Print height");
		
		area = 0.5*base*height;
		System.out.println("Print area of tringle"+area);
		
	}

}
