
class Transaction {
    double balance = 1000; // initial balance

    void processTransaction(double amount) {
        System.out.println("Processing transaction...");
    }
}


class Deposit extends Transaction {
  
    void processTransaction(double amount) {
        balance += amount;
        System.out.println("Transaction Type: Deposit");
        System.out.println("Amount Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
        System.out.println();
    }
}


class Withdrawal extends Transaction {
  
    void processTransaction(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Transaction Type: Withdrawal");
            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Transaction Type: Withdrawal");
            System.out.println("Insufficient Balance!");
        }
        System.out.println();
    }
}


class LoanRepayment extends Transaction {

    void processTransaction(double amount) {
        balance -= amount;
        System.out.println("Transaction Type: Loan Repayment");
        System.out.println("Amount Paid: " + amount);
        System.out.println("Updated Balance: " + balance);
        System.out.println();
    }
}


public class TransactionMethods {
    public static void main(String[] args) {

        
        Transaction[] transactions = new Transaction[3];

        transactions[0] = new Deposit();
        transactions[1] = new Withdrawal();
        transactions[2] = new LoanRepayment();

        double[] amounts = {500, 200, 300};

       
        for (int i = 0; i < transactions.length; i++) {
            transactions[i].processTransaction(amounts[i]);
        }
    }
}