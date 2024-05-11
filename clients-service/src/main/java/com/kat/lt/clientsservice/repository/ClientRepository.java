package com.kat.lt.clientsservice.repository;

import com.kat.lt.clientsservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface   ClientRepository extends JpaRepository<Client, Integer> {

    List<Client> findAll();

    Optional<Client> findById(Integer id);

    Client save(Client client);
}
