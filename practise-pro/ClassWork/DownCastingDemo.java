abstract class Animal{
	public Animal() {
		System.out.println("In superclass constructor : Animal");
	}
	public abstract void eat(Animal a);
}
class Dog extends Animal{
	public Dog() {
		System.out.println("In sublcass constructor : Dog");
	}
	public void eat(Animal a) {
		if(a instanceof Dog)
		{
			System.out.println("Dog eats with mouth");
		}
	}
}
class Monkey extends Animal{
	public Monkey() {
		System.out.println("In sublcass constructor : Monkey");
	}
	public void eat(Animal a) {
		if(a instanceof Monkey)
		{
			System.out.println("Monkey eats with hands");
		}
	}
}
public class DownCastingDemo {
	public static void main (String [] args) {  
	    Animal a=new Monkey();  
	    a.eat(a);  
	    a = new Dog();
	    a.eat(a);
	  }  
}
