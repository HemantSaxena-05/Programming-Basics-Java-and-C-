import java.util.Scanner;

class Number {
	protected int num;

	void setNumber(int n) {
		num = n;
	}

	void displayNumber() {
		System.out.println("Number: " + num);
	}
}

class FactorAnalysis extends Number {
	protected int factorCount = 0;
	protected int sumOfFactors = 0;
	protected int sumOfProperDivisors = 0;
		
	void analyzeFactors() {
		System.out.print("Factors: ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				factorCount++;
				sumOfFactors += i;

				if (i != num) {
					sumOfProperDivisors += i;
				}
			}
		}
		System.out.println();
	}

	void displayFactorDetails() {
		System.out.println("Count of Factors: " + factorCount);
		System.out.println("Sum of Factors: " + sumOfFactors);
		System.out.println("Sum of Proper Divisors: " + sumOfProperDivisors);
	}
}

class NumberClassification extends FactorAnalysis {
		
	void classifyNumber() {
		if (sumOfProperDivisors == num) {
			System.out.println("Number Type: Perfect");
		}
		else if (sumOfProperDivisors < num) {
			System.out.println("Number Type: Deficient");
		}
		else {
			System.out.println("Number Type: Abundant");
		}
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		NumberClassification obj = new NumberClassification();
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
	
		obj.setNumber(n);
		obj.displayNumber();

		obj.analyzeFactors();
		obj.displayFactorDetails();
		obj.classifyNumber();

		sc.close();
	}
}