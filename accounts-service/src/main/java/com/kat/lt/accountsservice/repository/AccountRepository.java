package com.kat.lt.accountsservice.repository;

import com.kat.lt.accountsservice.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

    @Override
    List<Account> findAll();

    Account findAccountByAccountNumber(String accountNumber);
}
