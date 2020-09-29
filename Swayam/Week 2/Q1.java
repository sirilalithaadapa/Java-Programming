// Complete the code segment to call the method  print() of class Student first and then call print() method of class School.


// This is the class named School
class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question21{ 
    public static void main(String args[]){
// Create an object of class Student

// Call 'print()' method of class Student 

// Create an object of class School

// Call 'print()' method of class School

Student obj =  new Student();

obj.print();

School obj_1 = new School();

obj_1.print();


     } 
}
