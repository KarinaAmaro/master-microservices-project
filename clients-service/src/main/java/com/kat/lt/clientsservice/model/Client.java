package com.kat.lt.clientsservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String identifyType;
    private String identifyNumber;
    private String password;
    @Column(unique = true)
    private String username;
    private boolean enabled;
    private Account account;

}
