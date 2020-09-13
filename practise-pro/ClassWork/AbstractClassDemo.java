abstract class Shape{
	private int color;
	public Shape() {
		
	}
	public Shape(int color) {
		this.color = color;
	}
	
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
			this.color = color;
	}
	
	public void typeOfShape() {
		System.out.println("This is a shape");
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}
class Rectangle extends Shape{
	private double length;
	private double breadth;
	
	public Rectangle() { 
		length = 10.0;
		breadth = 5.0;
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double getArea() {
		return length * breadth;
	}
	public double getPerimeter() {
		return 2 * (length + breadth);
	}
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double getArea() {
		return 3.147 * radius * radius;
	}

	@Override
	public double getPerimeter() {
            // TODO Auto-generated method stub
		return 0;
	}
	
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle myCircle = new Circle(22.5);
		System.out.println(myCircle.getArea());
		Rectangle myRectangle = new Rectangle();
		System.out.println(myRectangle.getArea());
	}

}
