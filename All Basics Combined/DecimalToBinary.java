import java.util.Scanner;

public class DecimalToBinary {
	 
	int decimalNumber;
	
	//Constructor to initialize the decimal number
	DecimalToBinary(int number) {
	    this.decimalNumber = number;
     	    convertToBinary();	   //Calling method inside the constructor
	}

	//Method to convert decimal to binary
	void convertToBinary() {
	
	    int temp = decimalNumber;
	    int binary = 0;
	    int place = 1;

	    while (temp > 0) {
	  	int remainder = temp % 2;	//Dividing by 2
		binary = binary + (remainder * place);
		place = place * 10;
		temp = temp / 2;
	   }

	   System.out.println("Binary equivalent of " + decimalNumber + " is: " + binary);
}

	//Main method
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter a decimal number: ");
	    int number = scanner.nextInt();

	    //Object creation (constructor is called here)
	    DecimalToBinary obj = new DecimalToBinary(number);

	    //closing scanner
	    scanner.close();
	}
}
