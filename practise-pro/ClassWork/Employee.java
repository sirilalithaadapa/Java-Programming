public class Employee extends Person {

	private int employeeID;
	private String designation;
	private String organizaton;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int employeeID, String designation, String organizaton) {
		this.employeeID = employeeID;
		this.designation = designation;
		this.organizaton = organizaton;
	}


	public Employee(String personName, char gender, int employeeID, String designation, String organizaton) {
		super(personName, gender);
		// TODO Auto-generated constructor stub
		this.employeeID = employeeID;
		this.designation = designation;
		this.organizaton = organizaton;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public String getDesignation() {
		return designation;
	}


	public String getOrganizaton() {
		return organizaton;
	}

	
	public void work() {
		System.out.println(super.getPersonName() + " is working at " 
				+ organizaton + " with designation " 
				+ designation + " with ID " 
				+ employeeID);
	}
	
}
