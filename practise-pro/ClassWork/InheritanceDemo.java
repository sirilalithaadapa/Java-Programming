
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student(501,"VVIT","CSE");
		stu1.setPersonName("Sriharsha");
		stu1.setGender('M');
		stu1.play();
		stu1.learn();
		stu1.eat();
		stu1.sleep();
		
		Employee empl1  = new Employee("abcdef", 'F', 123, " ABC", "XYZ");
		empl1.work();
		empl1.eat();
		empl1.learn();
		
		
	}

}
