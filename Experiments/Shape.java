package Experiments;


public class Shape {
	int n1;
	int n2;
	
	void printArea() {
		// Empty method
	}
	
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
		System.out.println("Area of Rectangle: " + n1 * (n2 / 2));
	}
}

class Circle extends Shape {
	void printArea() {
		// In this case n1 = radius, n2 = NULL
		System.out.println("Area of Rectangle: " + Math.PI * n1 * n1);
	}
}

