package Practice_Lecture10;

public class Calculator01 {
	//after the class those are Global variable
	int a= 67;
	int b = 22;
	//void type method
	public void addition () {
		//inside the method its local variable
		int total1 = a+b;
		System.out.println("Addition of a and b is: " + total1);
	}
	public void subtraction() {
		int total2 = a - b;
		System.out.println("Subtituate of a and b is:" + total2);
	}
	public void multipliction() {
		int total3 = a*b;
		System.out.println("Dultipliction and b is:" + total3);
	}
	public void division() {
		int total3 = a/b;
		System.out.println("Division a and b is:" + total3);
	}
}
