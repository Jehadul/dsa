package dsa;

public class QuickSortStack {

    public static int Pivot(int[] A, int Beg, int End) {
        int Left = Beg;
        int Right = End;
        int Loc = Beg;

        while (true) {
            // Scan from Left to Right
            while (A[Loc] <= A[Right] && Loc != Right) {
                Right--;
            }

            if (Loc == Right) {
                return Loc;
            }

            if (A[Loc] > A[Right]) {
                // Swap A[Loc] and A[Right]
                int temp = A[Loc];
                A[Loc] = A[Right];
                A[Right] = temp;
                Loc = Right;
            }

            // Scan from Right to Left
            while (A[Loc] >= A[Left] && Loc != Left) {
                Left++;
            }

            if (Loc == Left) {
                return Loc;
            }

            if (A[Loc] < A[Left]) {
                // Swap A[Loc] and A[Left]
                int temp = A[Loc];
                A[Loc] = A[Left];
                A[Left] = temp;
                Loc = Left;
            }
        }
    }

    // Iterative QuickSort using stacks
    public static void QuickSortStack(int[] A, int N) {
        int[] Lower = new int[N + 1]; // +1 to match pseudocode indexing starting from 1
        int[] Upper = new int[N + 1];
        int Top = 0;

        if (N > 1) {
            Top++;
            Lower[Top] = 1;  // Following pseudocode (1-based index)
            Upper[Top] = N;
        }

        while (Top != 0) {
            int Beg = Lower[Top];
            int End = Upper[Top];
            Top--;

            int Loc = Pivot(A, Beg - 1, End - 1); // Adjust to 0-based Java arrays

            if (Beg < Loc + 1) { // Left sublist
                Top++;
                Lower[Top] = Beg;
                Upper[Top] = Loc;
            }

            if (Loc + 2 < End) { // Right sublist
                Top++;
                Lower[Top] = Loc + 2;
                Upper[Top] = End;
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {44, 33, 11, 55, 77, 90, 40, 60, 99, 22};

        System.out.println("Original Array:");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        QuickSortStack(A, A.length);

        System.out.println("Sorted Array:");
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
