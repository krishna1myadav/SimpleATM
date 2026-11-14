package atm.service;

import atm.model.Account;
import atm.model.Transaction;
import atm.model.TransactionType;
import atm.presentation.ATMMenu;

import java.util.ArrayList;

public class ATMService {

    private Account account;
    private ATMMenu menu;

    private int pin = 1234;

    private ArrayList<Transaction> transactions = new ArrayList<>();


    public ATMService(Account account, ATMMenu menu){
        this.account = account;
        this.menu = menu;
    }
    public void startATM(){
        if (!authenticate()) {
            return;
        }
        int choice;

        do{
            menu.displayMenu();
            choice = menu.getChoice();

            switch (choice){
                case 1:
                    checkBalance();
                    break;

                case 2:
                    withdrawMoney();
                    break;

                case 3:
                    depositMoney();
                    break;

                case 4:
                    showTransactionHistory();
                    break;

                case 5:
                    System.out.println("Thank you for using our ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(choice !=5);
    }
    public void checkBalance(){
        System.out.println("Current balance is " + account.getBalance());
    }

    public void depositMoney() {

        double amount = menu.getAmount();

        double oldBalance = account.getBalance();

        account.deposit(amount);

        if (amount > 0) {

            if (account.getBalance() > oldBalance) {

                Transaction transaction = new Transaction(TransactionType.DEPOSIT, amount);

                transactions.add(transaction);
            }
        }

    }

    public void withdrawMoney() {

        double amount = menu.getAmount();

        double oldBalance = account.getBalance();

        account.withdraw(amount);

        if (account.getBalance() < oldBalance) {

            Transaction transaction = new Transaction(TransactionType.WITHDRAWAL, amount);

            transactions.add(transaction);
        }

    }
    public void showTransactionHistory() {

        System.out.println("\n===== TRANSACTION HISTORY =====");

        if (transactions.isEmpty()) {

            System.out.println("No transactions found.");

        } else {

            for (Transaction transaction : transactions) {

                transaction.displayTransaction();

                System.out.println("--------------------");
            }
        }
    }
    private boolean authenticate() {

        int attempts = 3;

        while (attempts > 0) {

            System.out.print("Enter ATM PIN: ");
            int enteredPin = menu.getChoice();

            if (enteredPin == pin) {
                System.out.println("Login successful!");
                return true;
            }

            attempts--;

            System.out.println("Wrong PIN!");
            System.out.println("Attempts left: " + attempts);
        }

        System.out.println("ATM access denied!");
        return false;
    }

}
