import java.util.Scanner;

public class UserIDGenerator {
	public static String userIdGenerator (String First_Name, String Last_Name, int PINCode, int N) {
		String userId = "";
		String LongName, SmallName;

		// Finding short name & long name
		if (First_Name.length() > Last_Name.length()) {
			SmallName = Last_Name;
			LongName = First_Name;
		}
		else if (First_Name.length() < Last_Name.length()) {
			SmallName = First_Name;
			LongName = Last_Name;
		} else {
			// Comparing strings lexicographically
			if (First_Name.compareTo(Last_Name) > 1) {
				SmallName = Last_Name;
				LongName = First_Name;
			} else {
				SmallName = First_Name;
				LongName = Last_Name;
			}
		}

		userId += Character.toUpperCase(SmallName.charAt(SmallName.length() - 1));
		userId += Character.toLowerCase(LongName.charAt(0));
		userId += LongName.substring(1, LongName.length()).toUpperCase();
		userId += String.valueOf(PINCode).charAt(N - 1);
		userId += String.valueOf(PINCode).charAt(String.valueOf(PINCode).length() - N);

		return userId;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String First_Name, Last_Name;
		System.out.print("Enter your First name: ");
		First_Name = in.next();
		System.out.print("Enter your Last name: ");
		Last_Name = in.next();
		System.out.print("Enter your pincode: ");
		int PINCode = in.nextInt();
		System.out.print("Enter number: ");
		int N = in.nextInt();
		System.out.println("Your username is :" + userIdGenerator(First_Name, Last_Name, PINCode, N));

		// test cases
		//System.out.println(userIdGenerator("Rajiv", "roy", 560037, 6));
		//System.out.println(userIdGenerator("Kumud", "kumar", 561327, 2));
	}

}
