//SavingsAccount.java - Siri Lalitha 

public class SavingsAccount
{
	private double balance;
	private double interest;

	public SavingsAccount()
	{
		balance = 0;
		interest = 0;
	}

	public SavingsAccount(double initialBalance, double initialInterest)
	{
		balance = initialBalance;
		interest = initialInterest;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void addInterest()
	{
		balance = balance + balance * interest;
	}

	public double getBalance()
	{
		return balance;
	}

}
