package youTube;

import java.util.Scanner;

public class Find_fahrenheit {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		double fah,cal;
		System.out.println("Enter fahrenheit");
		fah = scanner.nextDouble();
		
		cal= 1.8 *fah-32;
		System.out.println("Calcius" + cal);
		
		
	}

}
