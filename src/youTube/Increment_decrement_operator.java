package youTube;

public class Increment_decrement_operator {
	public static void main(String[] args) {
		int x =25;
		int y ;
		
		y= x++;//post increment
		System.out.println("Y" + y);//25
		
		y = x;//26
		System.out.println("Y" + y);//
		
		y=++x;//pre increment. it increse number
		System.out.println("Y ="+y);//y = 27
		
		y = x;//27
		System.out.println("Y" + y);//
		
		y=--x;//pre increment. it increse number
		System.out.println("Y ="+y);//y = 25
		
		y = x--;//25
		System.out.println("Y" + y);//
		

	}

}
