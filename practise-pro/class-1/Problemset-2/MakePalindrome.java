import java.util.Scanner;

public class MakePalindrome {

	public static int elememtToRemove (int number) {
		String sNumber = String.valueOf(number);
		int n = sNumber.length();
		for (int i = 0; i < n / 2; ++i) {
			if (sNumber.charAt(i) != sNumber.charAt(n - i - 1)) {
				if (sNumber.charAt(i) != sNumber.charAt(n - i - 2)) {
					return Character.getNumericValue(sNumber.charAt(i));
				}
				else {
					return Character.getNumericValue(sNumber.charAt(n - 1 -i));
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int palindrome = in.nextInt();
		System.out.println("The digit should be: " + elememtToRemove(palindrome));
	}

}
