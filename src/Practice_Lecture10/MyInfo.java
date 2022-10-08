package Practice_Lecture10;

public class MyInfo {
	public String name;//variables declared
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	public MyInfo () {//Default constructor Declared
		System.out.println("My information bellow Please check");
}
	//parameterized constructor
	public void myInfo(String name, byte age, short myApartmentRent, int myYearlySalary, long myBankBalance, float myHeight, double myGrade, char sex, Boolean usCitizen) {
		this.name = name;
		this. age = age;
		this.myApartmentRent =myApartmentRent;
		this. myYearlySalary= myYearlySalary;
		this.myBankBalance=myBankBalance;
		this.myHeight =myHeight;
		this.myGrade = myGrade;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("My name is:" +name +"\nMy age:" + age +"\nMy Apartment:" + myApartmentRent +"\nMy Yearly Salary is:" + myYearlySalary + "\nMy bank balance is:"+myBankBalance +"\nMy Height is:" +myHeight);
	}

}
