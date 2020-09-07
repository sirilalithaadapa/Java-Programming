import java.util.Scanner;
class SmartCard
{
    int emp_idn;
    public void MarkAttendance(Employee e)
    {
        emp_idn = e.getEmpId ();
        // instructions to mark present for empid ...
        System.out.println("Employee" + emp_idn  + "is marked Present");
     }
     public int getEmpIdn(Employee e)
     {
        return e.empid;
     }
}
