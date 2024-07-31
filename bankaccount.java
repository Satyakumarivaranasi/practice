public class BankAccount {
    private String accountType;
    private double balance;
    public BankAccount() {
        this.accountType = "checking";
        this.balance = 0.0;
    }

    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void deposit(double amount, String depositType) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " by " + depositType);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Testing the BankAccount class
        BankAccount savings = new BankAccount("savings", 1000);
        BankAccount checking = new BankAccount();
        savings.deposit(500);
        savings.deposit(200, "check")
        checking.withdraw(100); // Should print insufficient balance
        checking.deposit(300);
        checking.withdraw(100);
        System.out.println("Savings account balance: $" + savings.getBalance());
        System.out.println("Checking account balance: $" + checking.getBalance());
    }
}
