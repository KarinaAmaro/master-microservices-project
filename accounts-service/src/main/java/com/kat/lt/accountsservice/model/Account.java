package com.kat.lt.accountsservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document("account")
public class Account {

    @Id
    private String id;
    private String idClient;
    private String accountNumber;
    private String cardNumber;
    private String pin;
    private String balance;
    private String opening_date;
    private boolean enabled;

}
