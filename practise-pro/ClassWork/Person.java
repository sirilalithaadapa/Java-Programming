/**
 * This is a class for Person
 */

/**
 * @author Sree
 *
 */
public class Person {
	
	private String personName;
	private char gender;
	
	public Person() {
		System.out.println("In Super class constructor");
		
	}
	public Person(String personName, char gender) {
		super();
		this.personName = personName;
		this.gender = gender;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void eat() {
		//syso left ctrl + space
		System.out.println(personName + " is eating");
	}
	public void sleep() {
		System.out.println(personName + " is sleeping");
	}
	public void learn() {
		System.out.println(personName + " is learning");
	}
}
