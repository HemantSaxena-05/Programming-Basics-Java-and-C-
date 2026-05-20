import java.util.Scanner;

class EmployeeKiSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter Employee ID: ");
			String empIDInput = sc.nextLine();
			int empId = Integer.parseInt(empIDInput);
			
			System.out.print("Enter Salary: ");
			String salaryInput = sc.nextLine();
			double salary = Double.parseDouble(salaryInput);
			
			double deduction = salary * 0.10;
			
			if (salary == 0) {
				throw new ArithmeticException("Salary cannot be zero");
			}
			
			double netSalary = salary - deduction;
			
			System.out.println("\nEmployee ID: " + empId);
			System.out.println("Gross Salary: " + salary);
			System.out.println("Deduction (10%): " + deduction);
			System.out.println("Net Salary: " + netSalary);
			
		} catch (NumberFormatException e) {
			System.out.println("Invalid input! Please enter the numeric values.");
			
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			System.out.println("Salary processing completed");
			sc.close();
		}
	}
}