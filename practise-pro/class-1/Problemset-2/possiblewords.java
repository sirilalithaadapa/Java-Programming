import java.util.Scanner;

public class PossibleWords {

	public static String possibleWords (String input1, String input2) {
		String[] tests = input2.split(";");
		int n = input1.length();
		input1 = input1.toUpperCase();
		String result = "";
		boolean found;
		for (String test: tests) {
			test = test.toUpperCase();
			found = true;
			if (n == test.length() - 1) {
				continue;
			}
			for (int i = 0; i < n; ++i) {
				if (input1.charAt(i) == '_') {
					continue;
				}
				if (input1.charAt(i) != test.charAt(i)) {
					found = false;
					break;
				}
			}
			if (found) {
				result += test + ";";
			}
		}
		if (result.equals("")) {
			return "ERROR-009";
		}
		return result.substring(0, result.length()-1);

	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("input1: ");
		String input1 = in.next();
		System.out.print("input1: ");
		String input2 = in.next();
		System.out.println(possibleWords(input1, input2));
	}

}
