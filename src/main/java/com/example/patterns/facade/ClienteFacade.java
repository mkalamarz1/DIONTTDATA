package com.example.patterns.facade;

import com.example.patterns.model.Cliente;
import com.example.patterns.service.ClienteService;
import com.example.patterns.strategy.EnderecoStrategy;
import org.springframework.stereotype.Component;

@Component
public class ClienteFacade {

    private final ClienteService service;
    private final EnderecoStrategy strategy;

    public ClienteFacade(ClienteService service, EnderecoStrategy strategy) {
        this.service = service;
        this.strategy = strategy;
    }

    public Cliente criarCliente(String nome, String cep) {

        String endereco = strategy.buscar(cep);

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEndereco(endereco);

        return service.salvar(cliente);
    }
}

