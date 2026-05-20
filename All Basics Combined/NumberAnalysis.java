import java.util.Scanner;

//Class to analyze number
public class NumberAnalysis {

	//Creating method to check whether number is Evenish or Oddish
	public static void CheckOddishEvenish(int number) {
	  
	  int sum = 0;
	  int temp = number;

	  //Loop to calculate the sum of digits
	  while (temp != 0) {
	    int digit = temp % 10; //Extracting last digit
	    sum = sum + digit;    //Adding the digits to sum
	    temp = temp / 10;     //Removing the last digit
	   }
	
	   //Checking whether the sum is even or odd
	   if (sum % 2 == 0) {
	     System.out.println(number + " is Evenish. ");
	   } else {
	     System.out.println(number + " is Oddish. ");
	   }
	 }

	//Main Method
	public static void main(String[] args) {
	  
	  Scanner scanner = new Scanner(System.in);
	
	  //Accepting the number from user
	  System.out.print("Enter the number: ");
	  int number = scanner.nextInt();
		
	  NumberAnalysis obj = new NumberAnalysis();
          obj.CheckOddishEvenish(number);
	
	  //Closing Scanner
	  scanner.close();
	}
}