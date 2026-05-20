class Emp
{
	int empID;
	String empName;
	double salary;

	Emp()
	{
	  empID = 6523;
	  empName = "Hemant";
	  salary = 253311.25;

	  System.out.println("Employee Details:");
	  System.out.println("Employee ID: " + empID);
	  System.out.println("Employee Name: " + empName);
	  System.out.println("Salary: " + salary);
}

public static void main(String[] args)
{
	Emp e1 = new Emp();
}
} 