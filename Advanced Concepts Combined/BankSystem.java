class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Calculating interest...");
    }
}

class SavingsAccount extends Account {

    SavingsAccount(double balance) {
        super(balance);
    }
	
    void calculateInterest() {
        double interest = balance * 0.05; 
        double total = balance + interest;

        System.out.println("Savings Account:");
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + total);
    }
}

class CurrentAccount extends Account {

    CurrentAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.02;
        double total = balance + interest;

        System.out.println("Current Account:");
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + total);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(10000);
        Account acc2 = new CurrentAccount(10000);

        acc1.calculateInterest();
        System.out.println();
        acc2.calculateInterest();
    }
}