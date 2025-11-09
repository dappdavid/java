package algorithms.search.linear;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int linearSearch(int arr[], int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("The element is found at the index: " + i);
				return i;
			}
		}
		System.out.println("The element " + value + " not found.");
		return -1;
	}

}
