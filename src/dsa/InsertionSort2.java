package dsa;

public class InsertionSort2 {

	public static void main(String[] args) {
		int[] list = {5, 3, 8, 4, 2};

        insertionSort(list);

        // Print sorted list
        System.out.print("Sorted list: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] list) {
        int n = list.length;

        // Step 1: Repeat for I = 2 to N (but Java uses 0-based index)
        for (int i = 1; i < n; i++) { // i = 1 means 2nd element in the list
            int temp = list[i];       // Step 2: Temp := List[I]
            int j = i - 1;            // Step 3: J := I - 1

            // Step 4: Repeat while j ≥ 0 and List[J] > Temp
            while (j >= 0 && list[j] > temp) {
                list[j + 1] = list[j]; // Step 5: List[J+1] := List[J]
                j--;                   // Step 6: Decrement J
            }

            // Step 7: Place Temp at correct position
            list[j + 1] = temp;        // Step 7: List[J+1] := Temp
        }
    }
}