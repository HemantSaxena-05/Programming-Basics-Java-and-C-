class EmployeeDATA {
    public static void main(String[] args) {

        int empId;
        String name;
        double salary;


        empId = Integer.parseInt(args[0]);
        name = args[1];
        salary = Double.parseDouble(args[2]);

        System.out.println("Employee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}