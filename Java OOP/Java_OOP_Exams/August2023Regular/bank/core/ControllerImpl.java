package Java_OOP_Exams.August2023Regular.bank.core;

import Java_OOP_Exams.August2023Regular.bank.entities.bank.BranchBank;
import Java_OOP_Exams.August2023Regular.bank.entities.bank.CentralBank;
import Java_OOP_Exams.August2023Regular.bank.entities.client.Adult;
import Java_OOP_Exams.August2023Regular.bank.entities.client.Client;
import Java_OOP_Exams.August2023Regular.bank.entities.client.Student;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.MortgageLoan;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.StudentLoan;
import Java_OOP_Exams.August2023Regular.bank.repositories.LoanRepository;
import Java_OOP_Exams.August2023Regular.bank.entities.bank.Bank;
import Java_OOP_Exams.August2023Regular.bank.entities.loan.Loan;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static Java_OOP_Exams.August2023Regular.bank.common.ConstantMessages.*;
import static Java_OOP_Exams.August2023Regular.bank.common.ExceptionMessages.*;


public class ControllerImpl implements Controller {
    private LoanRepository loanRepository;
    private Map<String, Bank> banks;

    public ControllerImpl() {
        this.loanRepository = new LoanRepository();
        this.banks = new LinkedHashMap<>();
    }

    @Override
    public String addBank(String type, String name) { //todo WRONG SIGNATURE
        Bank bank;
        switch (type) {
            case "BranchBank":
                bank = new BranchBank(name);
                break;
            case "CentralBank":
                bank = new CentralBank(name);
                break;
            default:
                throw new NullPointerException(INVALID_BANK_TYPE);
        }

        banks.put(name, bank);

        return String.format(SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE, type);
    }

    @Override
    public String addLoan(String type) {
        Loan loan;
        switch (type) {
            case "StudentLoan":
                loan = new StudentLoan();
                break;
            case "MortgageLoan":
                loan = new MortgageLoan();
                break;
            default:
                throw new IllegalArgumentException(INVALID_LOAN_TYPE);
        }

        this.loanRepository.addLoan(loan);

        return String.format(SUCCESSFULLY_ADDED_BANK_OR_LOAN_TYPE, type);
    }
    @Override
    public String returnedLoan(String bankName, String loanType) {
        Loan loanForService = this.loanRepository.findFirst(loanType);

        if (loanForService == null) {
            throw new IllegalArgumentException(String.format(NO_LOAN_FOUND, loanType));
        }

        Bank bank = this.banks.get(bankName);
        bank.addLoan(loanForService);
        this.loanRepository.removeLoan(loanForService);

        return String.format(SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK, loanType, bankName);
    }

    @Override
    public String addClient(String bankName, String loanType, String clientName, String clientID, double income) {
        Client client;
        switch (loanType) {
            case "Student":
                client = new Student(clientName, clientID, income);
                break;
            case "Adult":
                client = new Adult(clientName, clientID, income);
                break;
            default:
                throw new IllegalArgumentException(INVALID_CLIENT_TYPE);
        }
        Bank bank = this.banks.get(bankName);

        String output;

        if (!isSuitableBank(loanType, bank)) {
            output = UNSUITABLE_BANK;
        } else {
            bank.addClient(client);
            output = String.format(SUCCESSFULLY_ADDED_CLIENT_OR_LOAN_TO_BANK, loanType, bankName);
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
        Bank bank = this.banks.get(bankName);

        double clientPrice = bank.getClients().stream()
                .mapToDouble(Client::getIncome).sum();
        double loanPrice = bank.getLoans().stream()
                .mapToDouble(Loan::getAmount).sum();

        return String.format(FUNDS_BANK, bankName, clientPrice + loanPrice);
    }

    @Override
    public String getStatistics() {
        return banks.values()
                .stream()
                .map(Bank::getStatistics)
                .collect(Collectors.joining(System.lineSeparator())).trim();
    }
}
