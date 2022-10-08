package youTube;

import java.util.Scanner;

public class Ternary_operator_class25 {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int num1, num2, large;
	System.out.println("Enter 2 number");
	num1 = scanner.nextInt();
	num2 = scanner.nextInt();
	
	//when i will put 2 number(ex:10,15) it will check that is num1(10) is grater than num2(15)
	// then num1 will print9store) if not then it will comes to num2
	large=(num1>num2) ? num1: num2;
	System.out.println("Large number"+large);
	
	
	 
	
	}

}
