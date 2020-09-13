import java.io.*;
import java.util.Scanner;
public class ArrayDemo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = scan.nextInt();
		int ar[] = new int[n];
		System.out.println("Read values into array");
		for(int i=0; i<n;i++)
		{
			ar[i] = scan.nextInt();
		}
		System.out.println("The contents of the array are");
		/*for(int i=0; i<n;i++)
		{
			System.out.printf("%d ",ar[i]);
		}*/
		for(int x : ar){
			System.out.print( x + " ");
		}
	}
}
