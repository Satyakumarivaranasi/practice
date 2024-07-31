package atm;

import bank.Account;

public class ATM {
    public static void main(String[] args) {
        // Create an account
        Account account = new Account("2143658709", "satya kumarii", 3000.0, "4436");

        // Access public method
        account.displayAccountInfo();

        // Access protected method (only possible if ATM is a subclass or within same package)
        // account.deposit(500.0); // This will cause a compile error

        // Access default method (only possible within the same package)
        // account.withdraw(200.0); // This will cause a compile error

        // Access private method (not directly accessible)
        // account.validatePin("1234"); // This will cause a compile error

        // Use public method to authenticate
        boolean isAuthenticated = account.authenticate("1234");
        System.out.println("Authentication: " + (isAuthenticated ? "Successful" : "Failed"));
    }
}

