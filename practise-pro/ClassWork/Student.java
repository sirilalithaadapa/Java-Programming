public class Student extends Person{
	//type left ctrl + space for intellisense
	private int registeredNumber;
	private String collegeName;
	private String departmentName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int registeredNumber, String collegeName, String departmentName) {
		//super();
		this.registeredNumber = registeredNumber;
		this.collegeName = collegeName;
		this.departmentName = departmentName;
	}

	
	public Student(String personName, char gender,int registeredNumber, String collegeName, String departmentName) {
		super(personName, gender);
		//super.setPersonName(personName);
		//setGender(gender);
		// TODO Auto-generated constructor stub
		this.registeredNumber = registeredNumber;
		this.collegeName = collegeName;
		this.departmentName = departmentName;
	}

	public int getRegisteredNumber() {
		return registeredNumber;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public String getDepartmentName() {
		return departmentName;
	}
	//overidden method
	public void learn() {
		System.out.println(getPersonName() + " is learning" + " in the department of "+
					getDepartmentName() + " at "+ getCollegeName() + 
					" with regd No "+getRegisteredNumber());
	}
	public void play() {
		System.out.println(getPersonName() + "is playing");
	}
}
