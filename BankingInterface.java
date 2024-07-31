interface BankingInterface {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
class SavingsAccount implements BankingInterface {
    private double balance;

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
class CurrentAccount implements BankingInterface {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankingInterface savings = new SavingsAccount();
        savings.deposit(500);
        savings.withdraw(200);
        System.out.println("Savings Account Balance: " + savings.getBalance());
        BankingInterface current = new CurrentAccount(1000); // overdraft limit is 1000
        current.deposit(1000);
        current.withdraw(1500);
        System.out.println("Current Account Balance: " + current.getBalance());
    }
}
