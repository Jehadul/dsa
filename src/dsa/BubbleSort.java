package dsa;

public class BubbleSort {

	public static void main(String[] args) {
		int[] n = { 10, 20, 5, 100, 25, 6 };

		bubbleSort(n);

		System.out.print("Bubble sort: ");
		for (int i : n) {
			System.out.print(i + " ");
		}
	}

	private static void bubbleSort(int[] list) {
		int n = list.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}

		}
	}

}
