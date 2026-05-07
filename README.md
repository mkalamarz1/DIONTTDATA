# Sistema de Clientes com Endereço (API REST)

Este projeto é uma API desenvolvida com **Spring Boot** para cadastro de clientes, com busca automática de endereço a partir do CEP.

## 🚀 Funcionalidades

- Cadastro de clientes
- Consulta de endereço via CEP
- Integração com serviço externo de CEP
- Persistência de dados em banco H2
- API REST funcional

## 🛠️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## 📌 Endpoint principal

### Criar cliente

**POST** `/clientes`

Exemplo de uso:

```bash
curl -X POST "http://localhost:8081/clientes?nome=Marcia&cep=90000000"
