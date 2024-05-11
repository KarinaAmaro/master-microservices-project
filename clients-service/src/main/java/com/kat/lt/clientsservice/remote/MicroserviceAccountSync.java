package com.kat.lt.clientsservice.remote;

import com.kat.lt.clientsservice.model.Account;
import com.kat.lt.clientsservice.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "accounts-service", url = "http://localhost:8080")
public interface MicroserviceAccountSync {

        @GetMapping(value = "/accounts", consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
        List<Account> findAll();

        @GetMapping(value = "/accounts/{id}", consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
        Optional<Account> findById(@PathVariable("id") Integer id);

        @PostMapping(value = "/accounts/add", consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
        Account save(Account cuenta);

}
