1. Write a program to demonstrate inter thread communication for a online shopping application.



 (There should be 2 synchronized method 

i.to confirm the order 

ii.to complete the payment. 

After completing the payment it should give the msg that order confirmed)

coding: 
   
class OnlineShopping {
    private boolean paymentCompleted = false;

    // Synchronized method to confirm the order
    public synchronized void confirmOrder() {
        System.out.println("Order confirmation started.");
        while (!paymentCompleted) {
            try {
                System.out.println("Waiting for payment to complete...");
                wait(); // Wait until the payment is completed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Order confirmed. Payment completed.");
    }

    // Synchronized method to complete the payment
    public synchronized void completePayment() {
        System.out.println("Payment started.");
        try {
            // Simulate time taken to complete payment
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted.");
        }
        paymentCompleted = true;
        System.out.println("Payment completed.");
        notify(); // Notify the waiting thread that payment is completed
    }

    public static void main(String[] args) {
        OnlineShopping shopping = new OnlineShopping();

        // Thread to confirm the order
        Thread orderThread = new Thread(new Runnable() {
            @Override
            public void run() {
                shopping.confirmOrder();
            }
        });

        // Thread to complete the payment
        Thread paymentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                shopping.completePayment();
            }
        });

        // Start both threads
        orderThread.start();
        paymentThread.start();
    }
}

output:  

Order confirmation started.
Waiting for payment to complete...
Payment started.
Payment completed.
Order confirmed. Payment completed.
