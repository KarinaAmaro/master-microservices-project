package com.kat.lt.clientsservice.controller;


import com.kat.lt.clientsservice.model.Client;
import com.kat.lt.clientsservice.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@AllArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientController {

    private  final ClientService clientService;

    @RequestMapping(method = RequestMethod.GET)
    List<Client> findAll() {
       return  clientService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Client findById(@PathVariable("id") int id) {
        return  clientService.findById(id).get();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    Client saveClient(@RequestBody Client client) {
        return  clientService.save(client);
    }
}
