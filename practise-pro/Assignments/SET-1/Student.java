// Student.java ------------>>>>>>>>SIRI LALITHA 

public class Student 
{ 
    // Instance Variables 
    String name; 
    String branch; 
    int rollno;  
  
    // Constructor Declaration of Class 
    public Dog(String name, String branch,int rollno)  
                   
    { 
        this.name = name; 
        this.branch = branch; 
        this.rollno = rollno;
    } 
  
    // method 1 
    public String getName() 
    { 
        return name; 
    } 
  
    // method 2 
    public String getBranch() 
    { 
        return branch; 
    } 
  
    // method 3 
    public int getRollNo() 
    { 
        return rollno; 
    } 
 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+  ".\nMy Branch,rollno " + this.getBranch()+"," + this.getRollno()+ ");  
    } 
  
    public static void main(String[] args) 
    { 
        Student details = new Student("Siri Lalitha","CSE", 19BQ1A05L4); 
        System.out.println(details.toString()); 
    } 
}
