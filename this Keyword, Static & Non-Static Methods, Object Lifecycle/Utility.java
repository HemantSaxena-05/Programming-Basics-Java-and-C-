class Utility {
	static Boolean isPrime(int num) {
	    if (num <= 1) {
		return false;
	    }
	  
	    for (int i =2; i <= num / 2; i++) {
		if (num % i == 0) {
		   return false;
		 }
	    }

	    return true;
	}

	void generateFibonacci(int n) {

	    int first = 0, second = 1;
	    System.out.println("Fibonacci series:");

	    for (int i =1; i <= n; i++) {
		System.out.print(first + " ");

		int next = first + second;
		first = second;
		second = next;
	    }

	    System.out.println();

	}
	
	public static void main(String[] args) {
	    int number = 13;

	    if (Utility.isPrime(number)) {
		System.out.println(number + " is a Prime Number");
	    } else {
		System.out.println(number + " is not a Prime Number");
	    }

	    Utility obj = new Utility();
	    obj.generateFibonacci(10);

	}
}