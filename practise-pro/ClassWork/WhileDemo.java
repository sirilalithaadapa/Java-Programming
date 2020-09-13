/* A Demo on While Loop
	Reversing a given number 
	Reading data/input using Scanner
*/
import java.io.*;
import java.util.*;
public class WhileDemo{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for n");
		int n = scanner.nextInt();
		int reverse = 0;
		while(n > 0) {
			int r = n % 10;
			System.out.println("In Loop r: "+r);
			reverse  = reverse * 10 + r;
			n = n / 10;
		}
		System.out.println(reverse);
	}
}
