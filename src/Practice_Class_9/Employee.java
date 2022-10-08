package Practice_Class_9;

public class Employee {
	//public class Employee {
	//Global variables( because they are not inside of the class or method. Anybody can access.  or class var..:because variables are after class..
	//variables are declared
	public String empName;
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;

	public Employee() {//constructor default ( no argument constructor) declared
		System.out.println("This default contructor is form Employee ");
		
	}
		
	public Employee (String empName) {//constructor parameterized
		this.empName = empName;
		System.out.println("The Employee Name is: "+ empName);
		
	}
	
	public Employee (String empName,int empId) {//constructor parameterized
		this.empName = empName;
		this. empId  = empId;
		System.out.println("The Employee Name is: "+ empName + ", Employ Id:" + empId);
		
	}
	 
	public Employee (String empName, int empId, char empSex) {
		this. empName = empName;
		this.empId= empId;
		this.empSex = empSex;
		System.out.println("The Employee Name is:" +empName +", Employee Id" +empId +", Employee Sex:" +empSex);
	}
	
	//parameterized constructor 02 Declar
	public Employee (String empName, int empId, char empSex, boolean fullTimeEmployee) {
		this. empName = empName;
		this. empId = empId;
		this. empSex = empSex;
		this. fullTimeEmployee = fullTimeEmployee;
		System.out.println("The Employeee Name is: " + empName +", Employ Id: " + empId + ", Employee sex: " + empSex +"And full time Employee? Ans: " +fullTimeEmployee);
		
		
	}
	
	}

