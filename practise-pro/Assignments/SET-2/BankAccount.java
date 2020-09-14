/**
 * A class to represent a bank account with an account number and a balance that
 * can be changed by deposits and withdrawals.
 */
class BankAccount
{
    // instance variable

    private String accountNum; // the account number
    private double balance;	   // the amount on deposit

    /**
     * Constructs a bank account with an account number and initial balance
     *
     * @param acctNum the account number
     * @param initialBalance the initial balance
     */
    public BankAccount(String acctNum, double initialBalance)
    {
        accountNum = acctNum;
        balance = initialBalance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount)	// note "mutator" method
    {
        double newBalance = balance + amount;
        balance = newBalance;				// modifies instance var			
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount)	// note "mutator" method
    {
        double newBalance = balance - amount;
        balance = newBalance;			// modifies instance var
    }

    /**
     * Gets the account number
     *
     * @return the account number
     */
    public String getAccount()	// note "accessor" method
    {
        return accountNum;		// returns value of instance var
    }

    /**
     * Gets the current balance
     *
     * @return the balance
     */
    public double getBalance()	// note "accessor" method
    {
        return balance;			// returns value of instance var
    }

    /**
     * Transfer funds from one bank account object to another
     *
     * @param destination the BankAccount object receiving the funds
     * @param amount the amount of money to be transferred
     */
    public void transferFundsA(BankAccount destination, double amount)
    {
        destination.balance = destination.balance + amount;
        // note explicit use of this to reference instance variables of the 
        // object for which the method was called
        this.balance = this.balance - amount;
    }

    //  Another way to transfer funds - by calling deposit and withdraw methods.
    //  Shows explicit use of "this" to call another method for the same object
    //  for which the current method was called.
    public void transferFundsB(BankAccount destination, double amount)
    {
        destination.deposit(amount);	// deposit to "destination" account
        this.withdraw(amount);           // withdraw from this account
    }
}
//******************** end of BankAccount class definition ********************

/**
 * A class to test the BankAccount2 class
 */
public class BankAccountTest2
{

    public static void main(String[] args)
    {
        // create two BankAccount objects
        BankAccount first = new BankAccount("1111111", 20000);
        BankAccount second = new BankAccount("2222222", 30000);

        // print initial balances
        System.out.printf("Account #%s has initial balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has initial balance of $%.2f%n",
                second.getAccount(), second.getBalance());

        // transfer $5000 from first to second account (via transferFundsA())
        first.transferFundsA(second, 5000);

        // print new balances
        System.out.println("\nAfter \"first.transferFunds(second, 5000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has new balance of $%.2f%n",
                second.getAccount(), second.getBalance());

        // transfer $10000 from second account to first (via transferFundsB())
        second.transferFundsB(first, 10000);

        // print new balances
        System.out.println("\nAfter \"second.transferFunds(first, 10000)\" ...");
        System.out.printf("Account #%s has new balance of $%.2f%n",
                first.getAccount(), first.getBalance());

        System.out.printf("Account #%s has new balance of $%.2f%n",
                second.getAccount(), second.getBalance());
    }
}
