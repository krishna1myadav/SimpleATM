package atm.presentation;

import java.util.Scanner;

public class ATMmenu {

    private Scanner sc = new Scanner(System.in);

    public void menu() {

        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        System.out.print("Enter your choice: ");
    }
    public int getChoice(){
        return sc.nextInt();
    }
}
