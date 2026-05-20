import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        id = sc.nextInt();

        sc.nextLine(); 
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Enter details of Employee 1");
        e1.accept();

        System.out.println("\nEnter details of Employee 2");
        e2.accept();

        System.out.println("\nEmployee with Higher Salary:");

        if (e1.salary > e2.salary) {
            e1.display();
        } else {
            e2.display();
        }
    }
}