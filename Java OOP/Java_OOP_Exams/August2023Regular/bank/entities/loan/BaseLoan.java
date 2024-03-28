package Java_OOP_Exams.August2023Regular.bank.entities.loan;

public class BaseLoan implements Loan {

    private int interestRate;
    private double amount;

    public BaseLoan(int interestRate, double amount) {
        this.interestRate = interestRate;
        this.amount = amount;
    }

    @Override
    public int getInterestRate() {
        return 0;
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
