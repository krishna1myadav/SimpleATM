package atm;

import atm.model.Account;
import atm.presentation.ATMMenu;
import atm.service.ATMService;


public class ATMMachine {
    public static void main(String[] args){
        Account account = new Account(5000);

        ATMMenu menu = new ATMMenu();

        ATMService atmService = new ATMService(account, menu);

        atmService.startATM();

    }
}
