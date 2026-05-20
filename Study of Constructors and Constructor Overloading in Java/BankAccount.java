class BankAccount
{
	int accNo;
	String accHolder;
	double balance;

	BankAccount()
	{
	  balance = 0;
	}

BankAccount(int no, String name, double bal)
	{
	  accNo = no;
	  accHolder = name;
	  balance = bal;
	}

void display()
{
	System.out.println("Account Number: " + accNo);
	System.out.println("Account Holder: " + accHolder);
	System.out.println("Balance: " + balance);
	System.out.println();
}

public static void main(String[] args)
{
	BankAccount b1 = new BankAccount();
	BankAccount b2 = new BankAccount(18956, "Hemant" , 256341);

	b1.display();
	b2.display();
}
}