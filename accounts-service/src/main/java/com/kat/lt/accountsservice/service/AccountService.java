package com.kat.lt.accountsservice.service;


import com.kat.lt.accountsservice.model.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {

    List<Account> findAll();

     Account findByAccount(String accountNumber);

    Account save(Account account);
}
