/* A Demo on Switch Case 
	To find whether a number is Odd or Even
*/
import java.io.*;
public class SwitchCaseDemo{
	public static void main(String args[]){
		float input = Float.parseFloat(args[0]);
		int r = (int)input % 2;
		switch(r){
			case 0: System.out.println(input + "is Even");
				break;
			case 1: System.out.println(input + "is Odd");
				break;
		}
	}
}
