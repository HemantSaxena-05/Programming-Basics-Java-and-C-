class Emp1
{
	int empID;
	String empName;
	double salary;

	Emp1(int empID, String name, double sal)
	{
	  this.empID = empID;
	  empName = name;
	  salary = sal;
	}

void display()
{
	System.out.println("Employee Details:");
	System.out.println("Employee ID: " + empID);
	System.out.println("Employee Name: " + empName);
	System.out.println("Salary: " + salary);
}

public static void main(String[] args)
{ 
	Emp1 e1 = new Emp1(2365, "Hemant" , 56987.23);
	e1.display();
}
}