import java.util.Scanner;

public class BookingMovieTicketEx {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt for user's age
        System.out.print("Enter your AGE: ");
        int age = sc.nextInt();
        
        // Prompt for movie time
        System.out.print("Enter the time of the movie : ");
        int timing = sc.nextInt();
        
        int ticketPrice = 0;
        
        // Free ticket for children under 5 and senior citizens (age 60 and above)
        if (age < 5 || age >= 60) {
            System.out.println("You got a FREE TICKET! Congratulations!");
            ticketPrice = 0;
        } else {
            // Matinee price for shows before noon
            if (timing < 12) {
                ticketPrice = 250;
                System.out.println("The ticket price for the matinee show is: " + ticketPrice);
            } 
            // Evening price for shows between 5 PM (17) and 9 PM (21)
            else if (timing >= 5 && timing <= 9) {
                ticketPrice = 300;
                System.out.println("The ticket price for the evening show is: " + ticketPrice);
            } 
            // Regular price for all other times
            else {
                ticketPrice = 200;
                System.out.println("The ticket price for the regular show is: " + ticketPrice);
            }
        }
        
        sc.close();
    }
}
