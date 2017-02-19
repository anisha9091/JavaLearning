package Assignment1;

public class StringReverse {

	public static String reverseUsingMethod(String str) {
		StringBuffer revString = new StringBuffer(str);
		return revString.reverse().toString();
	}

	/**
	 * @param str1
	 * @return
	 */
	public static String reverseWithoutMethod(String str1) {
		char[] main = str1.toCharArray();
		char[] rev = new char[main.length];
		int count = 0;
		for (int i = main.length - 1; i >= 0; i--) {
			rev[count] = main[i];
			count++;
		}
		return new String(rev);
	}

	public static void main(String[] args) {
		String sb = "Gourav";
		System.out.println(reverseUsingMethod(sb));
		System.out.println(reverseWithoutMethod(sb));
		
		

	}
}
