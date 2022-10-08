package youTube;


import java.util.Scanner;

public class AndClass_class22 {
	public static void main(String[] args) {
		Scanner inputScanner=new Scanner (System.in);
		int cha;
		System.out.println("Enter any letter");
		cha=inputScanner.nextInt();
		
		/*if (cha=='a' && cha=='e'&& cha=='i'&& cha=='o' && cha=='u') {
			System.out.println("Positive");
		}
		*/
		
		if ( cha>'a' && cha<'z') {//a-z
			System.out.println("Small Letter");
			
		}
		else if ( cha>'A' && cha<'Z') {//A-Z
			System.out.println("Capital Letter");
		}
		else {
			System.out.println("Not a letter");
		
		}
		
		
	}
	
	}
	
	
	
	


		


