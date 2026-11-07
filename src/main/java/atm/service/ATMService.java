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

}
