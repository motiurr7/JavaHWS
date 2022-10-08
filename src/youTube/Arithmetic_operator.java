package youTube;

import java.util.Scanner;

public class Arithmetic_operator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int number1 =20;
		int number2 = 10;
		int total= number1 + number2;
		
		System.out.println("Print first number: ");
		number1=input.nextInt();
		
		System.out.println("Print second number: ");
		number2=input.nextInt();
		
		total = number1 +number2;
		System.out.println("total Number="+ total);
		
		total = number1 - number2;
		System.out.println("substraction="+ total);
		
		total = number1 * number2;
		System.out.println("Multiplcation="+ total);
		
		double total2 = (double)number1 / number2;
		System.out.println("Divisiton="+ total);
		
		total = number1 % number2;
		System.out.println("Reminder="+ total);
		
	}
	

}
