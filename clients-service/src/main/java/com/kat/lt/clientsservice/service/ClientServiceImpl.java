package com.kat.lt.clientsservice.service;

import com.kat.lt.clientsservice.model.Account;
import com.kat.lt.clientsservice.model.Client;
import com.kat.lt.clientsservice.remote.MicroserviceAccountSync;
import com.kat.lt.clientsservice.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Service
public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;
    private final MicroserviceAccountSync microserviceAccountSync;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Integer id) {
        return clientRepository.findById(id);
    }

    @Override
    public Client save(Client client) {
        Account act = new Account();
        client.setAccount(microserviceAccountSync.save(act));

        return clientRepository.save(client);
    }
}
