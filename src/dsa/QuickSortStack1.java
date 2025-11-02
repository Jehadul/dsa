package dsa;

public class QuickSortStack1 {

	public static void main(String[] args) {
		int[] a = { 38, 27, 43, 3, 9, 82, 10 };

		quickSortStack(a, a.length);

		for (int num : a) {
			System.out.print(num + " ");
		}
	}

	public static int pivot(int[] a, int beg, int end) {
		int pivot = a[end];
		int i = beg - 1;
		for (int j = beg; j < end; j++) {
			if (a[j] <= pivot) {
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i + 1];
		a[i + 1] = a[end];
		a[end] = temp;
		return i + 1;
	}

	public static void quickSortStack(int[] a, int n) {
		int[] lower = new int[n];
		int[] upper = new int[n];
		int top = 0;

		if (n > 1) {
			top++;
			lower[top] = 0;
			upper[top] = n - 1;
		}

		while (top != 0) {
			int beg = lower[top];
			int end = upper[top];
			top--;

			int loc = pivot(a, beg, end);

			if (beg < loc - 1) {
				top++;
				lower[top] = beg;
				upper[top] = loc - 1;
			}

			if (loc + 1 < end) {
				top++;
				lower[top] = loc + 1;
				upper[top] = end;
			}
		}
	}

}
