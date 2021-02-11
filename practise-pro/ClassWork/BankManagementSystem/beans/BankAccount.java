package beans;
public class BankAccount {
	//Fields - Class Variables - Instance Variables
	private long accountNumber;
	private double balance;
	
	public BankAccount() {
		
	}

	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public double withdraw(double amount){
		if(amount < balance) {
			if(amount > util.Constants.minBalance) {
				System.out.println("Withdrawed amount is" + amount);
				balance -= amount;
			}
			else {
				System.out.println("Cannot withdraw");
			}
		}
		else {
			System.out.println("Cannot withdraw");
		}
		return balance;
	}
	
	public double deposit(double amount){
		if(amount <= util.Constants.upperLimit)
			balance += amount;
		else
			System.out.println("Upper limit reached");
		return balance;
	}
	
	public boolean transferMoney(BankAccount destinationAccount, double transferMoney) {
		if(balance > transferMoney) {
			if(transferMoney > util.Constants.minBalance) {
				destinationAccount.deposit(transferMoney);
				balance -= transferMoney;
				System.out.println(" "+transferMoney+" has been "
						+ "successfully debited from "+accountNumber+
						" and credited to "+destinationAccount.getAccountNumber());
				return true;
			}else
				return false;
		}
		else
			return false;
	}
}
