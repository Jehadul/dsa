package dsa;

public class FindMinimum {

	public static void main(String[] args) {
		int[] a = {48,10,50,15,18,90};
		
		int n = a.length;
		int m = a[0];
		
		for (int i = 1; i < n; i++) {
			if (a[i]<m) {
				m = a[i];
			}
		}
		System.out.println("Minimum value is: " + m);
	}

}
