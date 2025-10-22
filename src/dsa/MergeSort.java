package dsa;


public class MergeSort {
    static int[] a = {38, 27, 43, 3, 9, 82};

    public static void main(String[] args) {
        mergeSort(0, a.length - 1);

        // print sorted array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    static void mergeSort(int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }

    static void merge(int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1]; // +1 for sentinel
        int[] R = new int[n2 + 1]; // +1 for sentinel

        for (int i = 0; i < n1; i++) {
            L[i] = a[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = a[q + 1 + j];
        }

        L[n1] = Integer.MAX_VALUE; // sentinel
        R[n2] = Integer.MAX_VALUE; // sentinel

        int i = 0, j = 0;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
        }
    }
}
