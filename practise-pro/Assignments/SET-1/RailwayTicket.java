//RailwayTicket----> SIRI LALITHA  

import java.util.Scanner;

public class RailwayTicket {
    String name;
    String coach;
    long phonenumber;
    int amount;
    int totalamt;
    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter coach: ");
        coach = scanner.nextLine();
        System.out.print("Enter phonenumber: ");
        phonenumber = scanner.nextLong();
        System.out.print("Enter amount: ");
        amount = scanner.nextInt();
    }
    public void update()
        if (coach.equalsIgnoreCase("First_AC")) {
            totalamt = amount + 700;
        } else if (coach.equalsIgnoreCase("Second_AC")) {
            totalamt = amount  + 500;
        } else if (coach.equalsIgnoreCase("Third_AC")) {
            totalamt = amount  + 250;
        } else if (coach.equalsIgnoreCase("sleeper")) {
            totalamt = amount;    
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Coach: " + coach);
        System.out.println("Mobile  Number: " + phonenumber);
        System.out.println("Amount: " + amount);
        System.out.println("Total Amount: " + totalamt);
    }
    void main() {
        RailwayTicket railwayTicket = new RailwayTicket();
        railwayTicket.accept();
        railwayTicket.update();
        railwayTicket.display();
    }
}
       
    
