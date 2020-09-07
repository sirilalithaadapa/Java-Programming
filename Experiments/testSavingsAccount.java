class SavingsAccount {
    static double annualInterestRate = 0;
    private double savingsBalance;

    // Constructor
    public SavingsAccount (double savingsBal)
    {
        savingsBalance = savingsBal;
    }

    public double calculateMonthlyInterest()
    {
        double montlyInterset = (savingsBalance * annualInterestRate) / 2;
        savingsBalance += montlyInterset;
        return savingsBalance;
    }

    public static void modifyInterestRate(double interestRate)
    {
        annualInterestRate = interestRate;
    }
}

public class testSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        saver1.modifyInterestRate(0.04);

        // new balances
        System.out.println("Balance of saver1: " + saver1.calculateMonthlyInterest());
        System.out.println("Balance of saver2: " + saver2.calculateMonthlyInterest());

        saver1.modifyInterestRate(0.05);

        // new balances
        System.out.println("Balance of saver1: " + saver1.calculateMonthlyInterest());
        System.out.println("Balance of saver2: " + saver2.calculateMonthlyInterest());
    }
}
