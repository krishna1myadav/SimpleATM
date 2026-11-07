package atm;

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
            break;
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

    }
}

public class ATMmachine {
}
