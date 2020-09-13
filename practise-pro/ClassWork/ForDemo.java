/* A Demo on For Loop
	Printing values less than a given number n
	Reading data/input using Scanner
*/
import java.io.*;
import java.util.*;
public class ForDemo{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value for n");
		int n = scanner.nextInt();
		for(int i = 2; i <= n; i += 2){
			System.out.print( i +" ");
		}
	}
}
