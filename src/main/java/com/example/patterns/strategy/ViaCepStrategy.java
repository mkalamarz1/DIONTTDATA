package com.example.patterns.strategy;

import org.springframework.stereotype.Component;

@Component
public class ViaCepStrategy implements EnderecoStrategy {
    @Override
    public String buscar(String cep) {
        return "Endereço real via CEP: " + cep;
    }
}

