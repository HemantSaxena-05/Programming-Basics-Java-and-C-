import java.util.Scanner;

class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId;
        String name;
        double salary;

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}