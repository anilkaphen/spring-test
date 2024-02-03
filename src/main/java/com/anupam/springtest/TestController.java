package com.anupam.springtest;

import com.anupam.springtest.modal.Account;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    private List<Account> list = new ArrayList<>();
    @GetMapping("/accounts")
    public List<Account> getAllAccount() {
        return list;
    }
    @PostMapping("/account")
    public void saveAccount(@RequestBody Account account) {
        list.add(account);
    }
    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable String id) {
        return new Account(id, "Sohan", true, "01/03/1993", 45679, 890, "patna");
    }

}
