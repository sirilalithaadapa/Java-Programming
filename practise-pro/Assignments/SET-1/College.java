//College.java ------->> SIRI LALITHA 

public class College {
	static int numOfStudents;
	static int numOfFaculity;
	
	class Student {
		
		private String name;
		private String rollNo;
		private String course;
		
		public Student () { numOfStudents++;}
		
		public Student (String name, String rollNo, String course) {
			this.name = name;
			this.rollNo = rollNo;
			this.course = course;
			numOfStudents++;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getRollNo() {
			return rollNo;
		}
		
		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}
		
		public String getCorse() {
			return course;
		}
		
		public void setCourse(String course) {
			this.course = course;
		}
		
		public String getInformation() {
			return rollNo + " who's name is " + name + " studies " + course;
		}
	}
	
	class Faculity {
		
		private String name;
		private String subject;
		private int salary;
		
		public Faculity () { numOfFaculity++; }
		
		public Faculity (String name, String subject, int salary) {
			this.name = name;
			this.subject = subject;
			this.salary = salary;
			numOfFaculity++;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getSubject() {
			return subject;
		}
		
		public void setSubject(String subject) {
			this.subject = subject;
		}
		
		public int getSalary() {
			return salary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public String getInformation () {
			return name + " teaches " + subject + " and earns " + String.valueOf(salary);
		}
	}

	// Driver Code
	public static void main(String[] args) {
		College VVIT = new College();
		
		College.Student student1 = VVIT.new Student("Siri Lalitha", "19BQ1A05L4", "CSE");
		College.Student student2 = VVIT.new Student("Kaarthik", "19BQ1A05L5", "CSE");
		
		College.Faculity faculity1 = VVIT.new Faculity("Hari  Prasad", "C ", 50000);
		College.Faculity faculity2 = VVIT.new Faculity("Naga Sriharsha", "Java", 50000);
		
		System.out.println(student1.getInformation());
		System.out.println(faculity2.getInformation());
		
		System.out.println("No of students in college: " + VVIT.numOfStudents);
		System.out.println("No of teachers in college: " + VVIT.numOfFaculity);
	}
}
