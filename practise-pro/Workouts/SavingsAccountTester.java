//SavingsAccountTester.java  - Siri Lalitha 

public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		SavingsAccount sirisSavings = new SavingsAccount(1000, 0.10);
	  sirisSavings.withdraw(250);
		sirisSavings.deposit(400);
		sirisSavings.addInterest();
		System.out.println(sirisSavings.getBalance());
		System.out.println("Expected: 1265.0");
		//1000-250=750 => 750+400=1150 => 1150+1150*0.10=1265.0
	}
}
