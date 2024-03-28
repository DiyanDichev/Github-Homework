package Java_OOP_Exams.August2023Regular.bank.repositories;

import Java_OOP_Exams.August2023Regular.bank.entities.loan.Loan;

public interface Repository {

    void addLoan(Loan loan);

    boolean removeLoan(Loan loan);

    Loan findFirst(String type);
}
