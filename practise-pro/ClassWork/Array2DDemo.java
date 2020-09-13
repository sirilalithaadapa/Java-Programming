import java.io.*;
import java.util.Scanner;
public class Array2DDemo{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size in rows and columns");
		int n_rows = scan.nextInt();
		int n_cols = scan.nextInt();
		int [][] ar = new int[n_rows][];
		System.out.println("Read values into array");
		for(int i=0; i<n_rows;i++)
			for(int j = 0 ; j < n_cols ; j++) 
				ar[i][j] = scan.nextInt();
		System.out.println("The contents of the array are");
		for(int i=0; i<n_rows;i++){
			for(int j = 0 ; j < n_cols ; j++) 
				System.out.print(ar[i][j] +" ");
			System.out.println();
		}	
	}
}
