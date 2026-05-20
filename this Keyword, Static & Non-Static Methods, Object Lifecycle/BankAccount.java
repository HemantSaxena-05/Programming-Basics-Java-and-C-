import java.util.Scanner;

class Customer {
    int customerId;
    String customerName;

    Customer(int customerId, String customerName) {
	this.customerId = customerId;
	this.customerName = customerName;
    }
}

class BankAccount {
    Customer customer;
    int accountNumber;
    double balance;

    String[] transactions;
    int transactionCount = 0;

    BankAccount(Customer customer, int accountNumber,double balance, int size) {
	this.customer = customer;
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.transactions = new String[size];
    }

    void deposit(double amount) {
	if (amount > 0) {
	    balance += amount;
	    if (transactionCount < transactions.length) {
		transactions[transactionCount ++] = "Deposited: " + amount;
	    }
	    System.out.println("Amount Deposited Succesfully.");
	} else {
	    System.out.println("Invalid Deposit Amount.");
	}
}

void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;

            if (transactionCount < transactions.length) {
                transactions[transactionCount++] = "Withdrawn: " + amount;
            }

            System.out.println("Amount Withdrawn Successfully.");
        } else {
            System.out.println("Insufficient Balance! Withdrawal Failed.");
        }
    }
void displayCustomerDetails() {
    System.out.println("\n --Customer Details--");
    System.out.println("Customer ID: " + customer.customerId);
    System.out.println("Customer Name: " + customer.customerName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Current Balance: " + balance);
}

void displayTransactions() {
    System.out.println("\nTransaction History:");
    
    if (transactionCount ==  0) {
	System.out.println("No Transactions Yet.");
    }
    for (int i = 0; i < transactionCount; i++) {
	System.out.println(transactions[i]);
    }
}

void displayFinalDetails() {
	System.out.println("\n--Final Account Details--");
	System.out.println("Final Balance: " + balance);
}

public static void main(String[]  args) {
    Scanner sc = new Scanner(System.in);

    Customer c1 = new Customer(5623, "Hemant Saxena");
    BankAccount acc1 = new BankAccount(c1, 45216, 10000, 5);

    acc1.displayCustomerDetails();

    System.out.println("\nChoose Operation: ");
    System.out.println("1. Deposit");
    System.out.println("2. Withdrawl");

    int choice = sc.nextInt();

    System.out.print("Enter the amount: ");
    double amount = sc.nextDouble();

    if (choice == 1) {
	acc1.deposit(amount);
    } else if (choice == 2) {
	acc1.withdraw(amount);
    } else { 
	System.out.println("Invalid Choice");
    }

    acc1.displayTransactions();
    acc1.displayFinalDetails();

    sc.close();
   }
}