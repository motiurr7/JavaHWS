package Practice_Lecture08_01_java_variable;

public class Love {
	public String Name = "Shumi Akter";
	public int Years = 9;
	public char Gender = 'F';
	public byte Weight = 127;
	public long Salary = 723002874l;
	public short WeeklySalary = 6260;
	public float Pound = 32.00303f;
	public boolean Married = true;
	public double GPA = 3.3295;
	
	public static void main(String[] args) {
		Love Shumi = new Love(); //constructor Initialized
		System.out.println("My Name is " + Shumi.Name +"\nMy gender is " + Shumi.Gender + "\nMy weight is " +Shumi.Weight +"\nI am married? Ans is: " + Shumi.Married);
		
	}
}

