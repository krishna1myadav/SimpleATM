package atm;
import atm.model.Account;

import java.util.Scanner;

class ATM{
    float balance;
    int PIN = 1234;

    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if(enteredPIN == PIN){
            menu();
        }else {
            System.out.println("Wrong pin");
        }
    }
    public void menu() {
        System.out.println("Enter your Choice:");
        System.out.println("1. Check your A/C balance:");
        System.out.println("2. Withdraw Money:");
        System.out.println("3. Deposit Money:");
        System.out.println("4. Exit:");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1){
            checkBalance();
        } else if (choice == 2) {
            withdrawMoney();
        }else if(choice == 3){
            depositMoney();
        }else if(choice == 4){
            return;
        }else {
            System.out.println("Inter valid choice:");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println("Balance is: " + balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount > balance){
            System.out.println("Insufficient funds!");
        }else {
            balance = balance - amount;
            System.out.println("Money withdrawn successfully!");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter amount to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance){
            System.out.println("Insufficient funds!");
        }else {
            balance = balance + amount;
            System.out.println("Money deposited successfully!");
        }
        menu();
    }
}

public class ATMmachine {
    public static void main(String[] args){
        Account account = new Account(5000);

        System.out.println("Balance: " + account.getBalance());

        account.deposit(1000);

        System.out.println("Balance: " + account.getBalance());

        account.withdraw(2000);

        System.out.println("Balance: " + account.getBalance());
    }
}
