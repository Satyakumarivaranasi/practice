public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit Type Casting (Widening Conversion)
        int intValue = 123456789;
        double doubleValue = intValue; // Implicit casting from int to double
        System.out.println("Implicit Casting (Widening):");
        System.out.println("int value: " + intValue);
        System.out.println("double value after implicit casting: " + doubleValue);

        // Explicit Type Casting (Narrowing Conversion)
        double Value1 = 689.99999999999999;
        int anotherIntValue = (int) Value1; // Explicit casting from double to int
        System.out.println("\nExplicit Casting (Narrowing):");
        System.out.println("double value: " + Value1);
        System.out.println("int value after explicit casting: " + anotherIntValue);
    }
}