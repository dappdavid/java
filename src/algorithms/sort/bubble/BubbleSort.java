package algorithms.sort.bubble;

public class BubbleSort {

  public void executeBubbleSort(int arr[]) {
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

  public void print(int arr[]) {
    int n = arr.length;
    for (int i = 0; i<n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String args[]) {
    BubbleSort ob = new BubbleSort();
    int arr[] = {64, 34, 25, 12, 22, 11, 90, 88, 76, 45, 33, 21, 19, 5, 2};
    System.out.println("Original Array:");
    ob.print(arr);

    ob.executeBubbleSort(arr);

    System.out.println("Sorted Array:");
    ob.print(arr);
  }
}
