import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class RollNoComp implements Comparator<Student> {

    public int compare(Student s1, Student s2) {

        return s1.rollNo.compareTo(s2.rollNo);

    }

}

class NameComp implements Comparator<Student> {

    public int compare(Student s1, Student s2) {

        return s1.name.compareTo(s2.name);

    }

}

class PercentageComp implements Comparator<Student> {

    public int compare(Student s1, Student s2) {

        if (s1.percentage > s2.percentage) {
            return -1;
        } else if (s1.percentage < s2.percentage) {
            return 1;
        } else {
            return 0;
        }

    }

}


class Student {
    
    public String rollNo;
    public String name;
    public double percentage;
    private String address;
    private String branch;

    public Student() {}

    public Student(String rno, String name, double percentage, String address, String branch) {

        this.rollNo = rno;
        this.name = name;
        this.percentage = percentage;
        this.address = address;
        this.branch = branch;

    }

    public void displayInfo() {

        System.out.println("Roll no: " + this.rollNo);
        System.out.println("Name: " + this.name);
        System.out.println("Percentage: " + this.percentage);
        System.out.println("Address: " + this.address);
        System.out.println("Branch: " + this.branch + "\n");

    }    
}


public class Experiment22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeSet<Student> studentSortedRollnos = new TreeSet<Student> (new RollNoComp());
        TreeSet<Student> studentSortedNames = new TreeSet<Student> (new NameComp());
        TreeSet<Student> studentSortedPercentages = new TreeSet<Student> (new PercentageComp());

        System.out.print("Enter number of students: ");
        int numOfStudents = input.nextInt();

        for (int i = 0; i < numOfStudents; i++) {

            System.out.print("Enter roll number: ");
            String rollNo = input.next();

            System.out.print("Enter name: ");
            String name = input.next();

            System.out.print("Enter percentage: ");
            double percentage = input.nextDouble();

            System.out.print("Enter address: ");
            String address = input.next();

            System.out.print("Enter branch: ");
            String branch = input.next();

            Student s = new Student(rollNo, name, percentage, address, branch);

            studentSortedRollnos.add(s);
            studentSortedNames.add(s);
            studentSortedPercentages.add(s);

        }

        System.out.println("**********Sorted based on roll numbers**********");
        for (Student s : studentSortedRollnos) {
            s.displayInfo();
        }

        System.out.println("**********Sorted based on names**********");
        for (Student s : studentSortedNames) {
            s.displayInfo();
        }

        System.out.println("**********Sorted based on percentages**********");
        for (Student s : studentSortedPercentages) {
            s.displayInfo();
        }

    }
}
