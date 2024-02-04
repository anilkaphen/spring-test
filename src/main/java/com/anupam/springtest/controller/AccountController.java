package com.anupam.springtest.controller;

import com.anupam.springtest.modal.Account;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    private List<Account> list = new ArrayList<>();
    @GetMapping("/accounts")
    public List<Account> getAllAccount() {
        Account a = new Account("E001", "ald001", false, "20/12/1993", 200, 4000, "pune");
        a.setCity("Pune");
        a.setBalance(10000);
        list.add(a);
        return list;
    }
    @PutMapping("/account")
    public void saveAccount(@RequestBody Account account) {
        list.add(account);
    }

    @PostMapping("/account")
    public void updateAccount(@RequestBody Account account) {
        list.add(account);
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable String id) {
        return new Account(id, "Sohan", true, "01/03/1993", 45679, 890, "patna");
    }

}
