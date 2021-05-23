
package Arr;
import java.util.Arrays;

public class BubbleSortSinkingSort {
    // Optimized bubble sort in Java




  void bubbleSort(int array[]) {
    int size = array.length;

    // Run loops two times: one for walking throught the array
    // and the other for comparison
    for (int i = 0; i < size - 1; i++) {
 
      // swapped keeps track of swapping
      boolean swapped = true;
      for (int j = 0; j < size - i - 1; j++) {

        // To sort in descending order, change > to < in this line.
        if (array[j] > array[j + 1]) {
          
          // Swap if greater is at the rear position
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          
          swapped = false;
        }
      }
      
      // If there is not swapping in the last swap, then the array is already sorted.
      if (swapped == true)
        break;
    }
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = { -2, 45, 0, 11, -9 };
    BubbleSortSinkingSort bs = new BubbleSortSinkingSort();
    bs.bubbleSort(data);
    System.out.println("Sorted Array in Ascending Order:");
    System.out.println(Arrays.toString(data));
  }
}


