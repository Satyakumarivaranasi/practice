3) Write a Java program that creates a bank account with concurrent deposits and withdrawals using threads?

 coding:
 
class BankAccount {
    private int balance = 0;

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", Current balance: " + balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ", Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal of " + amount + ", Current balance: " + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

class DepositTask implements Runnable {
    private BankAccount account;
    private int amount;

    public DepositTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.deposit(amount);
            try {
                Thread.sleep(1000); // Simulate time taken to process deposit
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            account.withdraw(amount);
            try {
                Thread.sleep(1000); // Simulate time taken to process withdrawal
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        // create threads with the instance of the deposit and withdraw
        Thread depositThread1 = new Thread(new DepositTask(account, 100));
        Thread depositThread2 = new Thread(new DepositTask(account, 200));
        Thread withdrawThread1 = new Thread(new WithdrawTask(account, 150));
        Thread withdrawThread2 = new Thread(new WithdrawTask(account, 50));

        //start the thread
        depositThread1.start();
        depositThread2.start();
        withdrawThread1.start();
        withdrawThread2.start();
    }
}

output:

Deposited 200, Current balance: 300
Withdrew 150, Current balance: 150
Deposited 100, Current balance: 100
Withdrew 50, Current balance: 100
Deposited 200, Current balance: 300
Withdrew 150, Current balance: 150
Withdrew 50, Current balance: 200
Deposited 100, Current balance: 250
Deposited 200, Current balance: 400
Withdrew 150, Current balance: 250
Withdrew 50, Current balance: 200
Deposited 100, Current balance: 300
Deposited 200, Current balance: 500
Withdrew 150, Current balance: 350
Withdrew 50, Current balance: 300
Deposited 100, Current balance: 400
Deposited 200, Current balance: 600
Withdrew 150, Current balance: 450
Deposited 100, Current balance: 500
Withdrew 50, Current balance: 400