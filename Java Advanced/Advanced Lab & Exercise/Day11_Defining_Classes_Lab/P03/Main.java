package Day11_Defining_Classes_Lab.P03;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> accounts = new TreeMap<>();
        while (!"End".equals(input)) {
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.putIfAbsent(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created\n",bankAccount.getId());
                    break;
                case "Deposit":
                    int id = Integer.parseInt(data[1]);
                    double amount = Double.parseDouble(data[2]);
                    if(accounts.containsKey(id)){
                        accounts.get(id).deposit(amount);
                        System.out.printf("Deposited %s to ID%d\n",new DecimalFormat("#.##").format(amount),id);
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double interestRate = Double.parseDouble(data[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;
                case "GetInterest":
                    int idB = Integer.parseInt(data[1]);
                    int years = Integer.parseInt(data[2]);
                    if(accounts.containsKey(idB)){
                        double interest = accounts.get(idB).getInterest(years);
                        System.out.printf("%.2f\n",interest);
                    }else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
