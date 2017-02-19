package Assignment1;

public class ReverseIntArray {
	public int[] reverseArray(int[] a) {
		int count = 0;
		int[] revArray = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			revArray[count] = a[i];
			count++;
		}
		return revArray;
	}
	
	public int[] reverseArrayOtptimalSolution(int[] a) {
		int mid = a.length/2;
		for (int i = 0; i < mid; i++) {
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		return a;
	}


	public static void main(String[] args) {
		ReverseIntArray abc = new ReverseIntArray();
		int a[] = new int[] { 1, 5, 7, 3 };
		int rev[] = abc.reverseArrayOtptimalSolution(a);
		for (int i = 0; i < rev.length; i++) {
			System.out.println(rev[i]);
		}

	}
}
