interface Taxable {
	double calculateTax();
}

class Employee {
		protected String name;
		protected double basicSalary;
		
		public Employee(String name, double basicSalary) {
				this.name = name;
				this.basicSalary = basicSalary;
		}
		
		public void displayDetails() {
				System.out.println("Employee Name : " + name);
				System.out.println("basic Salary : " + basicSalary);
		}
	}
	
	class Manager extends Employee implements Taxable {
		private String department;
		
		public Manager(String name, double basicSalary, String department) {
			super(name, basicSalary);
			this.department = department;
		}
		
		@Override
		public double calculateTax() {
			double tax = 0;
			
			if (basicSalary <= 25000) {
				tax = 0;
			} else if (basicSalary <= 50000) {
				tax = basicSalary * 0.10;
			} else if (basicSalary <= 100000) {
				tax = basicSalary * 0.20;
			} else {
				tax = basicSalary * 0.30;
			}
			
			return tax;
		}
			
			public void displayFullDetails() {
				System.out.println("<<<<Manager Salary Details>>>>");
				super.displayDetails();
				System.out.println("Department : " + department);
				double tax = calculateTax();
				double netSalary = basicSalary - tax;
				System.out.println("Tax Deducted : " + tax);
				System.out.println("Net Salary : " + netSalary);
				System.out.println("-----------------------------");
			}
	}
	
	public class Main {
			public static void main(String[] args) {
				Manager m1 = new Manager("Hemant Saxena", 95600, "CyberSecurity");
				m1.displayFullDetails();
				
				System.out.println();
				
				Manager m2 = new Manager("Priya Singh", 68700, "HR");
				m2.displayFullDetails();
			}
	}
			