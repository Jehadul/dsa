package dsa;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 6, 1, 3};
        int n = arr.length;
        insertionSort(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
	
	static void insertionSort(int[] A, int n) {
        for (int j = 1; j < n; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i = i - 1;
            }
            A[i + 1] = key;
        }
    }

}
