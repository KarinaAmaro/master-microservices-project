package com.kat.lt.clientsservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


@Data
@NoArgsConstructor
public class Account {

    private String id;
    private String idClient;
    private String accountNumber;
    private String cardNumber;
    private String pin;
    private String balance;
    private String opening_date;
    private boolean enabled;

}
