package com.kat.lt.clientsservice.service;

import com.kat.lt.clientsservice.model.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;


public interface ClientService {


    List<Client> findAll();

    Optional<Client> findById(Integer id);

    Client save(Client client);
}
