Package test_project;

public class Testproject {
	public static void main(String[] args){
		//Logical operator 
		

		boolean  a = true;
		boolean  b = false;


		System.out.println(a & b);		//we get false

		System.out.println(b & a);		//we get false

		System.out.println(a & a);		//we get true

		System.out.println(b & b);		//we get false
              
   		System.out.println(a | a);		//we get true
		
		System.out.println(b | b);		//we get false
		
		System.out.println(a | b);		//we get true


		System.out.println(b | a);       	//we get true
    }
 }
