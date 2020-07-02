package com.greenfoxacademy.bankofsimba.controllers;


import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.repositories.AccountsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BankAccountController {

    AccountsList accountsList = new AccountsList();

    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public String getIndex(Model model) {
        BankAccount account = new BankAccount("Simba", 2000.00, "lion",false);
        model.addAttribute("account", account);
        return "index";
    }

    @GetMapping("ception")
    public String getHtmlception(Model model) {
        model.addAttribute("sentence", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "HTMLception";
    }

    @GetMapping("list-accounts")
    public String displayAllAccount(Model model){
        model.addAttribute("accounts", accountsList.getAccounts());
                return "list-accounts";
    }
}
