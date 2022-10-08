package Practice_Lecture08_01_java_variable;

public class Shumi_love {
	public String Name = "Shumi Akter";
	public int Years = 9;
	public char Gender = 'M';
	public byte Weight = 127;
	public long Salary = 723002874l;
	public short WeeklySalary = 6260;
	public float Pound = 32.00303f;
	public boolean Married = true;
	public double GPA = 3.3295;
	
	 public Shumi_love() { //Constructor declared. 
		 System.out.println("Do I ahve to write syso after the constructor or its's optional ");
	 }
	 public void shumi_love () {
		 System.out.println("My name is " + Name + "\nMy GpA: "+ GPA  + "\nMy Weight: " + Pound);
		 /* when you write void method  class then you can call by variable. 
		 When your constructor initialized then need to call string.Variable
		 */
	 }
	
}
