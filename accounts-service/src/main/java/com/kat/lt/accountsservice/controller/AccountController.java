package com.kat.lt.accountsservice.controller;


import com.kat.lt.accountsservice.model.Account;
import com.kat.lt.accountsservice.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/accounts")
public class AccountController {

    private  final AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    List<Account> findAll() {
       return  accountService.findAll();
    }

    @RequestMapping(value = "/{account_number}", method = RequestMethod.GET)
    Account findById(@PathVariable("account_number") String accountNumber) {
        return  accountService.findByAccount(accountNumber);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    Account saveAccount(@RequestBody Account account) {
        return  accountService.save(account);
    }
}
