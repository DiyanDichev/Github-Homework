package Java_OOP_Exams.August2023Regular.bank.entities.bank;


import Java_OOP_Exams.August2023Regular.bank.common.ExceptionMessages;
import Java_OOP_Exams.August2023Regular.bank.entities.client.Client;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseBank implements Bank {
    private String name;
    private int capacity;
    private Collection<Loan> loans;
    private Collection<Client> clients;

    public BaseBank(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
        this.loans = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.BANK_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    @Override
    public Collection<Client> getClients() {
        return this.clients;
    }

    @Override
    public Collection<Loan> getLoans() {
        return this.loans;
    }

    @Override
    public void addClient(Client client) {
        if(capacity < this.clients.size()){
            throw new IllegalArgumentException(ExceptionMessages.NOT_ENOUGH_CAPACITY_FOR_CLIENT);
        }
        this.clients.add(client);
    }

    @Override
    public void removeClient(Client client) {
        this.clients.remove(client);
    }

    @Override
    public void addLoan(Loan loan) {
        this.loans.add(loan);
    }

    @Override
    public int sumOfInterestRates() {
        return loans.stream().mapToInt(Loan::getInterestRate).sum();
    }

    @Override
    public String getStatistics() {
        return String.format("Name: %s, Type: %s%n", this.name, this.getClass().getSimpleName())
                + String.format("Clients: %s%n", getClients().isEmpty()
                ? "none"
                : this.getClients().stream().map(Client::getName).collect(Collectors.joining(", ")).trim())
                + String.format("Loans: %s, Sum of interest rates: %s", this.getLoans().size(), this.sumOfInterestRates()).trim();
    }
}