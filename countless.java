import java.util.Arrays;

public class CountElements {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 8, 10};
        int value = 6;
        int result = countElementsLessThan(array, value);
        System.out.println("Number of elements less than " + value + " is: " + result);
    }

    public static int countElementsLessThan(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num < value) {
                count++;
            } else {
                break;  // Since the array is sorted, we can stop once we reach a number >= value
            }
        }
        return count;
    }
}
