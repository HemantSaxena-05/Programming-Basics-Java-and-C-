import java.util.Scanner;

class Person {
    protected int personId;
    protected String personName;

    void setPersonDetails(int id, String name) {
        personId = id;
        personName = name;
    }

    void displayPersonDetails() {
        System.out.println("ID: " + personId);
        System.out.println("Name: " + personName);
    }
}

class Student extends Person {
    private int marks1, marks2, marks3;
    private int total;
    private double average;

    void setMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void calculateResult() {
        total = marks1 + marks2 + marks3;
        average = total / 3.0;
    }

    double getAverage() {
        return average;
    }

    void displayStudentDetails() {
        displayPersonDetails();
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("-----------------------------------");
    }
}

public class InheritanceArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (>=3): ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks of 3 subjects: ");
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();

            students[i].setPersonDetails(id, name);
            students[i].setMarks(m1, m2, m3);
            students[i].calculateResult();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            students[i].displayStudentDetails();
        }

        double highestAvg = students[0].getAverage();
        int topperIndex = 0;

        for (int i = 1; i < n; i++) {
            if (students[i].getAverage() > highestAvg) {
                highestAvg = students[i].getAverage();
                topperIndex = i;
            }
        }

        System.out.println("Student with Highest Average:");
        students[topperIndex].displayStudentDetails();

        sc.close();
    }
}