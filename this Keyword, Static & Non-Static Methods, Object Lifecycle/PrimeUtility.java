class PrimeUtility {
	//Static method to check whether a number is prime
	static boolean isPrime(int number) {

		if (number <= 1)  {
			return false;
	  	}
	
		for (int i = 2; i <= Math.sqrt(number); i++) {
		       if (number % i == 0) {
			     return false;
		       }
		}
		return true;
	}

	//Non static method to generate all prime numbers upto given limit
	void generatePrimesUpToLimit(int limit) {

		System.out.println("Prime numbers upto " + limit + " are:");

		for (int i = 2; i <= limit; i++) {
		      if (isPrime(i)) {			//calling static method
			   System.out.print(i + " ");
		      }
		}

		public static void main(String[]  args) {
			int number = 67;				//Giving number input to check
			int limit =  100; 				//Given limit for generating prime numbers

			//Checking whether given number is prime or not
			if (PrimeUtility.isPrime(number)) {
			     System.out.println(number + " is a Prime Number. ");
			} else {
			     System.out.println(number + " is not a Prime Number. ");
			}

			//Creating object to cal a non static method
			PrimeUtility obj = new PrimeUtility();
			obj.generatePrimesUpToLimit(limit);
		}
}