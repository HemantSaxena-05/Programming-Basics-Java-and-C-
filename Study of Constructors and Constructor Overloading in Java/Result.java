class Result
{
	String name;
	int m1, m2, m3;
	int total;
	double average;

Result(String n, int a, int b, int c)
{
	name = n;
	m1 = a;
	m2 = b;
	m3 = c;
}

void calculateTotal()
{
	total = m1 + m2 + m3;
}

void calculateAverage()
{
	average = total / 3.0;
}

void display()
{
	System.out.println("Student Name: " + name);
	System.out.println("Total Marks: " + total);
	System.out.println("Average Marks: " + average);
}

public static void main(String[] args)
{
	Result r1 = new Result("Hemant" , 85, 96, 77);

	r1.calculateTotal();
	r1.calculateAverage();
	r1.display();
}
}