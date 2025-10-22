package dsa;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {77, 33, 44, 11, 88, 22};
		
		selectionSort(a);
		
		System.out.print("Selection sort: ");
		
		for (int i : a) {
			System.out.print(i + ", ");
		}
	}
	
	private static void selectionSort(int[] list) {
		int n = list.length;
		
		for (int i = 0; i < n-1; i++) {
			int min = i;
			
			for (int j = i+1; j < n; j++) {
				if (list[j] <list[min]) {
					min = j;
				}
				
				
			}
			int temp = list[i];
			list[i] = list[min];
			list[min] = temp;
		}
	}

}
