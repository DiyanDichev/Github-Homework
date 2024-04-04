package Java_OOP_Exams.August2023Regular.bank.core;

import Java_OOP_Exams.August2023Regular.bank.entities.bank.BranchBank;
import Java_OOP_Exams.August2023Regular.bank.entities.bank.CentralBank;
import Java_OOP_Exams.August2023Regular.bank.repositories.LoanRepository;
import Java_OOP_Exams.August2023Regular.bank.common.ConstantMessages;
import Java_OOP_Exams.August2023Regular.bank.common.ExceptionMessages;
import Java_OOP_Exams.August2023Regular.bank.entities.bank.Bank;
import Java_OOP_Exams.August2023Regular.bank.entities.client.Adult;
import Java_OOP_Exams.August2023Regular.bank.entities.client.Client;
import Java_OOP_Exams.August2023Regular.bank.entities.client.Student;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.Loan;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.MortgageLoan;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.StudentLoan;

import java.util.*;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {


    private LoanRepository loanRepository;
    private Map<String, Bank> banks;

    public ControllerImpl() {
        this.loanRepository = new LoanRepository();
        this.banks = new LinkedHashMap<>();
    }

    @Override
    public String addBank(String type, String name) {
        Bank bank;
        switch (type) {
            case "BranchBank":
                bank = new BranchBank(name);
                break;
            case "CentralBank":
                bank = new CentralBank(name);
                break;
            default:
                throw new NullPointerException(ExceptionMessages.INVALID_BANK_TYPE);
        }

        this.banks.put(name,bank);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE,type);
    }

    @Override
    public String addLoan(String type) {
        Loan loan;
        switch (type) {
            case "MortgageLoan":
                loan = new MortgageLoan();
                break;
            case "StudentLoan":
                loan = new StudentLoan();
                break;
            default:
                throw new NullPointerException(ExceptionMessages.INVALID_LOAN_TYPE);
        }
        this.loanRepository.addLoan(loan);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE,type);
    }

    @Override
    public String returnedLoan(String bankName, String loanType) {
        Bank bank = this.banks.get(bankName);
        Loan loan = this.loanRepository.findFirst(loanType);

        if (loan == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.NO_LOAN_FOUND, loanType));
        }
        bank.addLoan(loan);
        this.loanRepository.removeLoan(loan);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK,loanType,bankName);
    }

    @Override
    public String addClient(String bankName, String clientType, String clientName, String clientID, double income) {
        Client client;
        switch (clientType) {
            case "Student":
                client = new Student(clientName, clientID, income);
                break;
            case "Adult":
                client = new Adult(clientName, clientID, income);
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.INVALID_CLIENT_TYPE);
        }
        Bank bank = this.banks.get(bankName);

        String output;

        if (!isSuitableBank(clientType, bank)) {
            output = ConstantMessages.UNSUITABLE_BANK;
        } else {
            bank.addClient(client);
            output = String.format(ConstantMessages.SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK, clientType, bankName);
        }

        return output;
    }

    private boolean isSuitableBank(String clientType, Bank bank) {
        String bankType = bank.getClass().getSimpleName();

        if (clientType.equals("Student") && bankType.equals("BranchBank")) {
            return true;
        } else if (clientType.equals("Adult") && bankType.equals("CentralBank")) {
            return true;
        }

        return false;
    }

    @Override
    public String finalCalculation(String bankName) {
        //Bank bank = ((Bank) this.banks.stream().map(e -> e.equals(bankName)));
        Bank bank = this.banks.get(bankName);
        double clientPrice = bank.getClients().stream().mapToDouble(Client::getIncome).sum();
        double loanPrice = bank.getLoans().stream().mapToDouble(Loan::getAmount).sum();

        return String.format(ConstantMessages.FUNDS_BANK, bankName, clientPrice + loanPrice);

    }

    @Override
    public String getStatistics() {
        return banks.values()
                .stream()
                .map(Bank::getStatistics)
                .collect(Collectors.joining(System.lineSeparator())).trim();
    }
}
