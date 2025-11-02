package dsa;

public class MergeSortAssignment {

	public static void main(String[] args) {
		int[] list = { 5, 2, 9, 1, 4, 6 };
		int[] templist = new int[list.length];

		mergeSort(list, templist, 0, list.length - 1);

		for (int num : list) {
			System.out.print(num + " ");
		}
	}

	public static void merge(int[] list, int[] templist, int lPos, int rPos, int rightEnd) {
		int leftEnd = rPos - 1;
		int tmpPos = lPos;
		int numElement = rightEnd - lPos + 1;

		while (lPos <= leftEnd && rPos <= rightEnd) {
			if (list[lPos] <= list[rPos]) {
				templist[tmpPos++] = list[lPos++];
			} else {
				templist[tmpPos++] = list[rPos++];
			}
		}

		while (lPos <= leftEnd) {
			templist[tmpPos++] = list[lPos++];
		}

		while (rPos <= rightEnd) {
			templist[tmpPos++] = list[rPos++];
		}

		for (int i = 0; i < numElement; i++, rightEnd--) {
			list[rightEnd] = templist[rightEnd];
		}
	}

	public static void mergeSort(int[] list, int[] templist, int left, int right) {
		if (left < right) {
			int Center = (left + right) / 2;
			mergeSort(list, templist, left, Center);
			mergeSort(list, templist, Center + 1, right);
			merge(list, templist, left, Center + 1, right);
		}
	}

}
