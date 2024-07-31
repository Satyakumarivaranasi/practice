public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            //array index out of bound exception
            int[] array = {10,20,30};
            System.out.println("Accessing element at index 4: " + array[4]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        try {
            // Arithmetic Exception
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result of division: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        System.out.println("Program continues to execute normally.");
    }
}
