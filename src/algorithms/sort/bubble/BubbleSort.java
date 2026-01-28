package algorithms.sort.bubble;

public class BubbleSort {

  public void bubbleSort(int arr[]) {
    int n = arr.length;
    boolean swapped;
    for (int i = 0; i < n-1; i++) {
      swapped = false;
      for (int j =0; j < n-i-1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swapped = true;
        }
      }
      if (!swapped)
        break;
    }
  }

  public void printArray(int arr[]) {
    int n = arr.length;
    for (int i = 0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    BubbleSort ob = new BubbleSort();
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    System.out.println("Original Array:");
    ob.printArray(arr);

    ob.bubbleSort(arr);

    System.out.println("Sorted Array:");
    ob.printArray(arr);
  }
}
