package bank;

public class Account {
    // Public variable
    public String accountNumber;

    // Protected variable
    protected double balance;

    // Default (package-private) variable
    String accountHolderName;

    // Private variable
    private String pinCode;

    // Constructor
    public Account(String accountNumber, String accountHolderName, double balance, String pinCode) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.pinCode = pinCode;
    }

    // Public method
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    // Protected method
    protected void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Default (package-private) method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Private method
    private boolean validatePin(String pin) {
        return this.pinCode.equals(pin);
    }

    // Public method to access private method
    public boolean authenticate(String pin) {
        return validatePin(pin);
    }
}
