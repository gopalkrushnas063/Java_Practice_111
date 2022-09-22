package sprint4.ja111_assignment_day_16.question3;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){

        balance = balance+amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if(amount <= balance) {
            balance -= amount;
        }
        else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    };

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
