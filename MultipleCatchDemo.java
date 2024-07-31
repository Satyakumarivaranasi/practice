public class MultipleCatchDemo {

    public static void main(String[] args) {
        try {
            // Array Index Out of Bounds Exception
            int[] array = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + array[5]); 

            // Arithmetic Exception
            int a = 10;
            int b = 0;
            int result = a / b; 
            System.out.println("Result of division: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
        System.out.println("Program continues to execute normally.");
    }
}
