package com.kat.lt.clientsservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String idClient;
    private String accountNumber;
    private String cardNumber;
    private String pin;
    private String balance;
    private String opening_date;
    private boolean enabled;

   // @OneToOne
    //@JoinTable(name = "clients_account", joinColumns = @JoinColumn(name="account_id"), inverseJoinColumns = @JoinColumn(name="acoount_id"))
    //private Client clients;

}
