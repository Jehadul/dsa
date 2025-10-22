package dsa;

public class InsertionSort3 {

	public static void main(String[] args) {
		
		int [] list = {77, 33, 44, 11, 88, 22};
		
		insertionSort(list);
		System.out.print("Insertion sort: ");
		for (int i : list) {
			System.out.print(i + " ");
		}
	}

	private static void insertionSort(int[] list) {
		int n = list.length;
		
		for (int i = 1; i < n; i++) {
			int temp = list[i];
			int j = i-1;
			
			while (j>=0 && list[j]>temp) {
				list[j+1] = list[j];
				j--;
			}
			list[j+1] = temp; 
		}
		
	}
}