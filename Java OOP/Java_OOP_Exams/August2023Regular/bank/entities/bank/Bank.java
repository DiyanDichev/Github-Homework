package Java_OOP_Exams.August2023Regular.bank.entities.bank;

import Java_OOP_Exams.August2023Regular.bank.entities.client.Client;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.Loan;

import java.util.Collection;

public interface Bank {
    String getName();

    void setName(String name);

    Collection<Client> getClients();

    Collection<Loan> getLoans();

    void addClient(Client client);

    void removeClient(Client client);

    void addLoan(Loan loan);

    int sumOfInterestRates();

    String getStatistics();
}
