import java.util.Scanner;
public class ArmstrongNumberCheck {
	public static void main(String[] args) {

	 //Creating Scanner object for input
	 Scanner scanner = new Scanner(System.in);
	
	 //Taking and accepting the number from user
	 System.out.print("Enter a any number: ");
	 int number = scanner.nextInt();

	 int originalNumber = number; //storing original number
	 int remainder;
	 int sum = 0;

	 //Loop to extract digits and calculate cube sum
	 while (number !=0) {
	 
	    remainder = number % 10; //Get last digit
	    sum = sum + (remainder * remainder * remainder); //Cube of digit
	    number = number / 10; //Removing last digit
	   }
	
	// Checking Armstrong condition
	if (sum == originalNumber) {
	  System.out.println(originalNumber + " is an Armstrong number.");
	} else {
	  System.out.println(originalNumber + " is not an Armstrong number.");
	}

	//Closing Scanner
	scanner.close();
      }
}


	