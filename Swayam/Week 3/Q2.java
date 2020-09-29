// Define a class Point with two fields x and y each of type double. Also , define a method distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double. Complete the code segment given below. Use Math.sqrt( ) to calculate the square root.

import java.util.Scanner;

 public class Circle extends Point{
	 	  
     public static void main(String[] args) {
    
	 Scanner sc = new Scanner(System.in);
	 Point c=new Point(); //Create a point center
	 c.x=sc.nextDouble();
	 c.y=sc.nextDouble();
	 Point p=new Point();  //Create a point on circumference
	 p.x=sc.nextDouble();
	 p.y=sc.nextDouble(); 
	 Circle c1=new Circle(); //Create an object of class Circle
	 c1.distance(c,p);  //Calcualte radius of the circle
	
  }
 
}
class Point 
{
  double x;
  double y;
  void distance(Point p1, Point p2)
  {
    double dis=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y) * (p2.y-p1.y));
    System.out.print(dis);
  }    
                         
}                         
