
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(5L4,"VVIT","CSE");
		stu1.setPersonName("Siri");
		stu1.setGender('F');
		stu1.play();
		stu1.learn();
		stu1.eat();
		stu1.sleep();
		
		Employee empl1  = new Employee("Vaseem", 'F', 123, " AB", "Shaik");
		empl1.work();
		empl1.eat();
		empl1.learn();
		
		
	}

}
