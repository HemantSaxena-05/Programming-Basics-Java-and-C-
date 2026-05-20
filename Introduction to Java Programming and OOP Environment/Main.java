import java.util.Scanner;
public class Main { 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter Age, Percentage, and Grade:");

int age = sc.nextInt();
float percentage = sc.nextFloat();
char grade = sc.next().charAt(0);

System.out.println("Age: "+age);
System.out.println("Percentage: "+percentage);
System.out.println("Grade: "+grade);

sc.close();
}
}
