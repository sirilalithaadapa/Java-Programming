//RailwayTicket----> SIRI LALITHA  

import java.util.*;
public class RailwayTicket
{
  
        String name,coach;
        int amt,totalamt;
         long mobno;
        void accept()
       {
                 Scanner sc=new Scanner(System.in);
                 System.out.println("enter name");
                 name=sc.next();
                 System.out.println("enter coach");
                 System.out.println("1) First_AC,2)Second_AC,3) Third_AC,4) Sleeper");
                System.out.println("enter your option");
                coach=sc.next();
               System.out.println("enter phone no");
               mobno=sc.nextLong();
               System.out.println("enter amount");
               amt=sc.nextInt();
      }
    void update()
   {
        System.out.println("1) First_AC,2)Second_AC,3) Third_AC,4) Sleeper");
        System.out.println("if u are interested to change ur coach");
       System.out.println("choose option");
       Scanner s=new Scanner(System.in);
       int op=s.nextInt();
       if(op==1)
       {
           totalamt=amt+700;
       }
       else if(op==2)
        {
            totalamt=amt+500;
        }
      else if(op==3)
     {
            totalamt=amt+250;
       }
     else
     {
      totalamt=amt;
      }
 }
void display()
{
  System.out.println(name);
  System.out.println(coach);
  System.out.println(mobno);
  System.out.println(totalamt);
}
public static void main(String args[])
{
   RailwayTicket r=new RailwayTicket();
    r.accept();
    r.update();
    r.display();
}
}
   
    
