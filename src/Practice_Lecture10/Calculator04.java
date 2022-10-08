package Practice_Lecture10;

public class Calculator04 {
	byte a =50;
	byte b = 11;
	public byte division() {
		byte total1 = (byte) (a / b);
		System.out.println("Division of a and b is: " + total1);
		return total1;
	}
	public byte multiplication() {
		byte total2 = (byte) (a*b);
		return total2;
		
	}
}