1) Write a program to create a Thread by implementing Runnable interface using sleep method.
 
coding:
  
    class Display implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Welcome to coding class");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Msg implements Runnable {
    public void run() {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Today's topic is threads");
            try {
              // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(2000);
            } catch (Exception e) {
              // Handle the interrupted exception
                e.printStackTrace();
            }
        }
    }
}

public class MyRunnable {
    public static void main(String[] args) {
        // Create an instance of the display and msg class
        Runnable obj1 = new Display();
        Runnable obj2 = new Msg();

        // Create a thread with the instance of
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start the thread
        t1.start();
        t2.start();
    }
}


output: 
Welcome to coding class
Today's topic is threads
Welcome to coding class
Today's topic is threads
Welcome to coding class
Today's topic is threads
Welcome to coding class
Today's topic is threads
Welcome to coding class
Today's topic is threads
Welcome to coding class
Today's topic is threads
Welcome to coding class
Today's topic is threads
