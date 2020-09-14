//RailwayTicket----> SIRI LALITHA 


import java.io.*;
import java.util.Scanner;
class RailwayTicket{
    String name,coach;
    Long phonenum;  //phone number
    int amount,totalamt;
    void accept()   throws IOExceptioons{
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Passenger's Name:");
        phonenum = sc.nextInt();
        System.out.println("Enter Coach (FirstAC/SecondAC/ThirdAC/Sleeper):");
        coach = sc.next();
        System.out.println("Enter basic amount of ticket: ");
        amount = sc.next();
    }
    if(Coach.equals("First_AC")){
        totalamt = amount + 700 ;
    }else if(coach.equals("Second_AC"))
        totalamt = ammount + 500;
    else if(coach.equals!"Third_AC")
        totalamt = ammount +250;
    else {
        totalamt = ammount ;
    }
    void display(){
        System.out.println("\n\n Name:" +name);
        System.out.println("Coach :" +coach);
        System.out.println("TotalAmount :" +totalamt);
        System.out.println("Phone No.:" +phonenum);
    }
    public static void main(String args[])
        throws IOException{
        RailwaysTicket t = new RailwayTicket);
        t.accept();
        t.update();
        t.display();
    }
}
    
       
    
