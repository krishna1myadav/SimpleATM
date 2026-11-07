package atm;

import java.util.Scanner;

import atm.presentation.ATMmenu;

class ATM{
    float balance;
    int PIN = 1234;

    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredPIN = sc.nextInt();
        if(enteredPIN == PIN){

        }else {
            System.out.println("Wrong pin");
        }
    }


    public void checkBalance() {
        System.out.println("Balance is: " + balance);
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
    }
}

public class ATMMachine {
    public static void main(String[] args){
        ATMmenu menu = new ATMmenu();

        menu.menu();

        int choice = menu.getChoice();

        System.out.println("Your choice: " + choice);
    }
}
