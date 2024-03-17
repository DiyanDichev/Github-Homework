package Day11_Defining_Classes_Lab.P03;

public class BankAccount {

    private static final double DEFAULT_INTEREST_RATE = 0.02d;
    private static int bankAccountCount = 1;
    private static double interestRate = DEFAULT_INTEREST_RATE;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = bankAccountCount++;
    }
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public double getInterest(int years) {
        return interestRate * this.balance * years;
    }

    public int getId() {
        return id;
    }
}
