package youTube;

import java.util.Scanner;

public class Assignmnet_operator {
	public static void main(String[] args) {
		int x=3;
		int y = 2;
		x+=y;//x=x+y = 5
		Scanner input = new Scanner(System.in);
		System.out.println("Print valuse of x=");
		x = input.nextInt();
		
		System.err.println("Print Value Of Y=");
		y = input.nextInt();
		
		System.out.println("x =" + x);
		
		x-=y;//x=x-y =3
		System.out.println("x =" +x);
		
		x*=y;//x=x*y =6
		System.out.println("x =" +x);
		
		x/=y;//x=x/y=3
		System.out.println("x =" +x);
		
		x%=y;//x=x%y = 1
		System.out.println("x =" +x);
		
	
	}

}
