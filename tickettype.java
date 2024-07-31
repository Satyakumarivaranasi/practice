import java.util.Scanner;
public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of the second side: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of the third side: ");
        double side3 = scanner.nextDouble();
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is an equilateral triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is an isosceles triangle.");
        } else {
            System.out.println("The triangle is a scalene triangle.");
        }

        scanner.close();
    }
}