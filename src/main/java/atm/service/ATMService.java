package atm.service;

import atm.model.Account;
import atm.presentation.ATMmenu;

public class ATMService {
    private Account account;
    private ATMmenu menu;

    public ATMService(Account account, ATMmenu menu){
        this.account = account;
        this.menu = menu;
    }
    public void startATM(){
        int choice;

        do{
            menu.menu();
            choice = menu.getChoice();

            switch (choice){
                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.println("Withdrawal feature coming soon");
                    break;

                case 3:
                    System.out.println("Deposit feature coming soon");
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }while(choice !=4);
    }
    public void checkBalance(){
        System.out.println("Current balance is " + account.getBalance());
    }
}
