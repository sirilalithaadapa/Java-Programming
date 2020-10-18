package Experiments;

import java.util.Scanner;

//@SIRI LALITHA 
public class RationalNumber {
	public static int gcd(int n1, int n2) {
		
		// Always set both numbers to positive 
		n1 = (n1 > 0) ? n1 : -n1;
		n2 = (n2 > 0) ? n2 : -n2;
		
		while (n1 != n2) {
			if (n1 > n2)
				n1 -= n2;
			else
				n2 -= n1;
		}
		
		return n1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		
		int d = gcd(n1, n2);
		
		int dn1 = n1 / d;
		int dn2 = n2 / d;
		
		System.out.println(n1 + " / " + n2 + " Should be represented as " + dn1 + " / " + dn2);
	}
}
