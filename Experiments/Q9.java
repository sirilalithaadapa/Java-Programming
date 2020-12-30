package Experiments;

import java.util.Scanner;
import java.lang.System;

class Employee {
	String EmployeeName;
	String id;
	String Address;
	String MailId;
	String MobileNo;
	
	void display() {
		System.out.println("Name: " + EmployeeName);
		System.out.println("ID: " + id);
		System.out.println("Mail: " + MailId);
		System.out.println("Phone number: ");
	}

}

class Programmer extends Employee {
	int basicPay;
	
	void setBasicPay(int BP) {
		basicPay = BP;
	}
	
	void display() {
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("DA: " + 0.97 * basicPay);
		System.out.println("HRA: " + 0.10 * basicPay);
		System.out.println("PF: " + 0.12 * basicPay);
		System.out.println("Staff club fund: " + 0.001 * basicPay);
	}
}

class AssistantProfessor extends Employee {
	int basicPay;
	
	void setBasicPay(int BP) {
		basicPay = BP;
	}
	
	void display() {
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("DA: " + 0.97 * basicPay);
		System.out.println("HRA: " + 0.10 * basicPay);
		System.out.println("PF: " + 0.12 * basicPay);
		System.out.println("Staff club fund: " + 0.001 * basicPay);
	}
}

class AssociateProfessor extends Employee {
	int basicPay;
	
	void setBasicPay(int BP) {
		basicPay = BP;
	}
	
	void display() {
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("DA: " + 0.97 * basicPay);
		System.out.println("HRA: " + 0.10 * basicPay);
		System.out.println("PF: " + 0.12 * basicPay);
		System.out.println("Staff club fund: " + 0.001 * basicPay);
	}
}

class Professor extends Employee {
	int basicPay;
	
	void setBasicPay(int BP) {
		basicPay = BP;
	}
	
	void display() {
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("DA: " + 0.97 * basicPay);
		System.out.println("HRA: " + 0.10 * basicPay);
		System.out.println("PF: " + 0.12 * basicPay);
		System.out.println("Staff club fund: " + 0.001 * basicPay);
	}
}

public class Experiment9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Programmer emp = new Programmer();
		
		System.out.print("Enter name: ");
		emp.EmployeeName = in.next();
		System.out.print("Enter ID: ");
		emp.id = in.next();
		System.out.print("Mail: ");
		emp.MailId = in.next();
		System.out.print("Phone number: ");
		emp.MobileNo = in.next();
		System.out.print("Address: ");
		emp.Address = in.next();
		
		System.out.print("Basic Pay: ");
		emp.basicPay = in.nextInt();
		
		emp.display();
	}
}
