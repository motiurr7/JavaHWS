package youTube;

import java.util.Scanner;

public class positiveDemo_class18 {
/*	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int num;
		System.out.println("Enter a Number");
		num=inputScanner.nextInt();
		
		if(num>0) {
			System.out.println("Positive");
		}
		else if(num>0){
			System.out.println("Negative");
		}
		else {
			System.out.println("Equal to Zero");
		}	
	}
	*/
	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		num= scanner.nextInt();
		
		if(num>0) {//take -2
			System.out.println("Positive");
			
			/*if (num>0) {//take 2
				System.out.println("Negative");
				*/
			}
		
		else if (num>0){
			System.out.println("Negative");
			
		}
		else {
			System.out.println("Equal to Zero");
		}
	}

}

