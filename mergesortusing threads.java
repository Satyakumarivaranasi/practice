2.Write a Java program that sorts an array of integers using multiple threads.
 
coding:
 
import java.util.Arrays;

public class ParallelSort {
  private static final int ARRAY_SIZE = 400;
  private static final int NUM_THREADS = 4;

  public static void main(String[] args) {
    int[] array = createArray();
    System.out.println("Before sorting: " + Arrays.toString(array));

    Thread[] threads = new Thread[NUM_THREADS];
    int segmentSize = ARRAY_SIZE / NUM_THREADS;

    for (int i = 0; i < NUM_THREADS; i++) {
      int startIndex = i * segmentSize;
      int endIndex = (i == NUM_THREADS - 1) ? ARRAY_SIZE - 1 : (startIndex + segmentSize - 1);
      threads[i] = new Thread(new SortTask(array, startIndex, endIndex));
      threads[i].start();
    }

    for (Thread thread: threads) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    mergeSort(array, 0, ARRAY_SIZE - 1);

    System.out.println("After sorting: " + Arrays.toString(array));
  }

  private static int[] createArray() {
    int[] array = new int[ARRAY_SIZE];
    for (int i = 0; i < ARRAY_SIZE; i++) {
      array[i] = (int)(Math.random() * 400); // Generate random numbers between 0 and 400
    }
    return array;
  }

  private static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(array, left, mid);
      mergeSort(array, mid + 1, right);
      merge(array, left, mid, right);
    }
  }

  private static void merge(int[] array, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left, j = mid + 1, k = 0;

    while (i <= mid && j <= right) {
      if (array[i] <= array[j]) {
        temp[k++] = array[i++];
      } else {
        temp[k++] = array[j++];
      }
    }

    while (i <= mid) {
      temp[k++] = array[i++];
    }

    while (j <= right) {
      temp[k++] = array[j++];
    }

    System.arraycopy(temp, 0, array, left, temp.length);
  }

  static class SortTask implements Runnable {
    private int[] array;
    private int startIndex;
    private int endIndex;

    public SortTask(int[] array, int startIndex, int endIndex) {
      this.array = array;
      this.startIndex = startIndex;
      this.endIndex = endIndex;
    }

    @Override
    public void run() {
      Arrays.sort(array, startIndex, endIndex + 1);
    }
  }
}
  

output:

Before sorting: [76, 53, 44, 53, 11, 4, 86, 9, 5, 73, 66, 8, 33, 68, 10, 8, 68, 95, 94, 1, 54, 84, 63, 48, 73, 59, 28, 74, 62, 86, 37, 93, 84, 18, 22, 72, 46, 79, 56, 32, 3, 68, 57, 51, 60, 69, 59, 62, 15, 17, 4, 50, 6, 85, 4, 77, 7, 57, 16, 54, 21, 41, 82, 77, 95, 23, 4, 30, 56, 78, 84, 26, 14, 53, 97, 22, 73, 47, 55, 10, 56, 81, 95, 17, 3, 54, 33, 83, 65, 29, 59, 39, 34, 72, 54, 89, 19, 87, 97, 25]
After sorting: [1, 3, 3, 4, 4, 4, 4, 5, 6, 7, 8, 8, 9, 10, 10, 11, 14, 15, 16, 17, 17, 18, 19, 21, 22, 22, 23, 25, 26, 28, 29, 30, 32, 33, 33, 34, 37, 39, 41, 44, 46, 47, 48, 50, 51, 53, 53, 53, 54, 54, 54, 54, 55, 56, 56, 56, 57, 57, 59, 59, 59, 60, 62, 62, 63, 65, 66, 68, 68, 68, 69, 72, 72, 73, 73, 73, 74, 76, 77, 77, 78, 79, 81, 82, 83, 84, 84, 84, 85, 86, 86, 87, 89, 93, 94, 95, 95, 95, 97, 97]

