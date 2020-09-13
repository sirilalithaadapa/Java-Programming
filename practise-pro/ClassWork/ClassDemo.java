import java.io.*;
import java.util.Scanner;
public class ClassDemo{
	public static void main(String []args){
		Rectangle object1 = new Rectangle();
		Rectangle object2 = new Rectangle(12.5f,10.4f);
		object1.setLength(12.5F);
		object1.setBreadth(10.6f);
		System.out.println("Area is "+object1.area());
		System.out.println("Perimeter is "+object1.perimeter());
	
		System.out.println("Area is "+object2.area());
		System.out.println("Perimeter is "+object2.perimeter());
		
	}
}
class Rectangle{
	//Properties
	private float length;
	private float breadth;
	
	//Constructor
	public Rectangle(){
		length = 10.5f;
		breadth = 0.0f;
	}
	public Rectangle(float l,float b){
		length = l;
		breadth = b;
	}
	//Getters
	public void setLength(float l){
		length = l;
	}
	public void setBreadth(float b){
		breadth = b;
	}
	//Methods
	public float area(){
		return length * breadth;
	}
	
	public float perimeter(){
		return 2 * (length + breadth);
	}
}
