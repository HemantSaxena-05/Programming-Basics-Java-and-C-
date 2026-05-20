class NumberOperation {
	int num1;
	int num2;

	NumberOperation(int num1, int num2) {
	    this.num1 = num1;
	    this.num2 = num2;
	}

	void calculateGCDandLCM() {
	    int a = num1;
	    int b = num2;
	
	    while (b != 0) {
		int temp = b;
		b = a % b;
		a = temp;
	    }

	    int gcd = a;
	    int lcm = (num1 * num2) / gcd;

	    System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	    System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
	}
	
	public static void main(String[] args) {
		
	    NumberOperation obj = new NumberOperation(15, 60);

	    obj.calculateGCDandLCM();
	}
}
