package Practice_Lecture08_01_java_variable;

public class MyInfo {
	public String myName = "Shumi Akter";
	public int myYears = 9;
	public char myGender = 'F';
	public byte myWeight = 127;
	public long mySalary = 723002874l;
	public short myWeeklySalary = 6260;
	public float myPound = 32.00303f;
	public boolean myMarriedLife = true;
	public double myGPA = 3.3295;
    //good if you use constructor. Here, we are not using constructor
	
	public void shumi() {
	//MyInfo shumiAkter = new MyInfo();
	System.out.println("Name: "+myName+" \nI live in USA "+"for "+myYears+" years. " + "\nAm I married: " +"Ans is"+myMarriedLife);
	System.out.println("My Gender:" + myGender + "\nMy weekly salary: " + myWeeklySalary);
	
	 }
	

	}
