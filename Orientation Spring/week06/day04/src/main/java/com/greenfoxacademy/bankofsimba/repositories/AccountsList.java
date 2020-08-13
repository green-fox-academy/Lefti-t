package com.greenfoxacademy.bankofsimba.repositories;

import com.greenfoxacademy.bankofsimba.models.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountsList {
    private  List<BankAccount> accounts;

    public AccountsList() {
        accounts = new ArrayList<>();
        accounts.add(new BankAccount("Mufasa",3000,"lion",true));
        accounts.add(new BankAccount("Scar",4000,"lion",false));
        accounts.add(new BankAccount("Pumba",2000,"boar",false));
        accounts.add(new BankAccount("Timon",1000,"Suricat",false));

    }

    public  List<BankAccount> getAccounts() {
        return accounts;
    }

}
