import java.io.*;
import java.util.*;
public class Experiment5{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String []dict = input.split(",");
		for(int i=0;i<dict.length-1;i++)
			for(int j=0; j<dict.length-i-1;j++){
				if(dict[j].compareTo(dict[j+1]) > 0){
					String temp = dict[j];
					dict[j] = dict[j+1];
					dict[j+1] = temp;
				}
			}
		System.out.println("Contents in dictionary are:");
		for(String s : dict)
			System.out.println(s);
		String str = scan.next();
		boolean flag = false;
		int low=0;
		int high = dict.length-1;	
		while (low <= high){
			int mid = (low + high)/2;
			if(str.compareTo(dict[mid])==0){
				flag  = true;
				break;
			}
			else if(str.compareTo(dict[mid]) > 0)
				low = mid +1;
			else
				high = mid -1;
				
		}
		if(flag)
			System.out.println("Word is in the dictionary");
		else
			System.out.println("Word is not in the dictionary");		
			
	}
}
