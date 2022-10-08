package youTube;

import java.util.Scanner;

public class Enven_odd_class19 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num;
		System.out.println("Enter any potisitve integer: ");
		num=scanner.nextInt();
		
		if (num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
	
	

}
