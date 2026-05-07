package com.example.patterns.controller;

import com.example.patterns.facade.ClienteFacade;
import com.example.patterns.model.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteFacade facade;

    public ClienteController(ClienteFacade facade) {
        this.facade = facade;
    }

    @PostMapping
    public Cliente criar(@org.springframework.web.bind.annotation.RequestParam("nome") String nome,
                           @org.springframework.web.bind.annotation.RequestParam("cep") String cep) {
        return facade.criarCliente(nome, cep);
    }
}

