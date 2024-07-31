import java.util.Scanner;

class Geometry {
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geometry geometry = new Geometry();

        int choice;
        do {
            System.out.println("\nGeometry Calculator");
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.println("Area of the rectangle: " + geometry.calculateArea(length, width));
                    break;
                case 2:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + geometry.calculateArea(radius));
                    break;
                case 3:
                    System.out.print("Enter length of the box: ");
                    double boxLength = scanner.nextDouble();
                    System.out.print("Enter width of the box: ");
                    double boxWidth = scanner.nextDouble();
                    System.out.print("Enter height of the box: ");
                    double height = scanner.nextDouble();
                    System.out.println("Volume of the box: " + geometry.calculateVolume(boxLength, boxWidth, height));
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
