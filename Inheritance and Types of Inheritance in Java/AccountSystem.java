
class Account {
    int accountNumber;
    double balance;

    void setAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void calculateInterest() {
        System.out.println("Interest calculation in Account class");
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


class SavingsAccount extends Account {
    double interestRate;

    void setSavingsAccount(int accNo, double bal, double rate) {
        setAccount(accNo, bal);
        interestRate = rate;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        balance = balance + interest;
        System.out.println("Interest added: " + interest);
    }

    void displayAccount() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
    }
}


class CurrentAccount extends Account {
    double overdraftLimit;

    void setCurrentAccount(int accNo, double bal, double limit) {
        setAccount(accNo, bal);
        overdraftLimit = limit;
    }

    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }

    void displayAccount() {
        System.out.println("Current Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}


public class AccountSystem {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        s.setSavingsAccount(101, 10000, 5);
        s.calculateInterest();
        s.displayAccount();

        System.out.println();

        CurrentAccount c = new CurrentAccount();
        c.setCurrentAccount(202, 15000, 5000);
        c.calculateInterest();
        c.displayAccount();
    }
}