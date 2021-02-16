package Experiments;

abstract class Shape {
	int n1;
	int n2;
	
	abstract void printArea();
}

class Rectangle extends Shape {
	void printArea() {
		// In this case n1 = width, n2 = Length
		System.out.println("Area of Rectangle: " + n1 * n2);
	}
}

class Triangle extends Shape {
	void printArea() {
		// In this case n1 = Height, n2 = Base
		System.out.println("Area of Triangle: " + n1 * (n2 / 2));
	}
}

class Circle extends Shape {
	void printArea() {
		// In this case n1 = radius, n2 = NULL
		System.out.println("Area of Circle: " + Math.PI * n1 * n1);
	}
}

public class Experiment11 {
	// Driver Code for testing
	public static void main(String[] args) {
		Rectangle rt = new Rectangle();
		rt.n1 = 2;
		rt.n2 = 3;
		rt.printArea();
		
		Triangle tr = new Triangle();
		tr.n1 = 2;
		tr.n2 = 3;
		tr.printArea();
		
		Circle c = new Circle();
		c.n1 = 2;
		c.printArea();
	}
	
	/**
	Area of Rectangle: 6
	Area of Triangle: 2
	Area of Circle: 12.566370614359172
	*/
}
