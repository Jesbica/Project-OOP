````md
# 🚗 Sistema Automotivo – Gestão de Estoque de Veículos

Sistema CRUD desenvolvido em Java com Spring Boot para gerenciamento de estoque de veículos de concessionárias.

O projeto foi desenvolvido com foco em Programação Orientada a Objetos, arquitetura MVC e integração com banco de dados MySQL.

---

# 📌 Funcionalidades

✅ Cadastro de veículos  
✅ Cadastro de marcas  
✅ Listagem de veículos  
✅ Busca por modelo  
✅ Busca por ano  
✅ Busca por preço  
✅ Busca por status  
✅ Atualização de informações  
✅ Exclusão de veículos  
✅ API REST com Spring Boot  
✅ Persistência de dados com MySQL  

---

# 🛠️ Tecnologias Utilizadas

| Tecnologia | Função |
|---|---|
| Java 17 | Linguagem principal |
| Spring Boot | Framework backend |
| Spring Data JPA | Persistência de dados |
| MySQL | Banco de dados |
| Maven | Gerenciamento de dependências |
| Postman | Testes da API |

---

# 📂 Estrutura do Projeto

```text
src/
 └── main/
     ├── java/
     │    └── br/com/concessionaria/
     │         ├── controller/
     │         ├── model/
     │         ├── repository/
     │         ├── service/
     │         └── App.java
     │
     └── resources/
          └── application.properties
````

---

# 🗄️ Banco de Dados

## Criar banco no MySQL

```sql
CREATE DATABASE sistema_veiculos;
```

---

# ⚙️ Configuração do application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/sistema_veiculos
spring.datasource.username=root
spring.datasource.password=123456

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# ▶️ Como Executar o Projeto

## 1. Clonar o repositório

```bash
git clone https://github.com/SEU-USUARIO/sistema-gestao-veiculos.git
```

---

## 2. Abrir no IntelliJ IDEA

Abrir a pasta do projeto.

---

## 3. Configurar o MySQL

Criar o banco:

```sql
CREATE DATABASE sistema_veiculos;
```

---

## 4. Executar a aplicação

Rodar a classe:

```text
App.java
```

ou executar:

```bash
mvn spring-boot:run
```

---

# 🌐 Endpoints da API

## 📌 Veículos

| Método | Endpoint       | Descrição         |
| ------ | -------------- | ----------------- |
| POST   | /veiculos      | Cadastrar veículo |
| GET    | /veiculos      | Listar veículos   |
| GET    | /veiculos/{id} | Buscar por ID     |
| PUT    | /veiculos/{id} | Atualizar veículo |
| DELETE | /veiculos/{id} | Excluir veículo   |

---

## 🔎 Filtros

| Método | Endpoint                  |
| ------ | ------------------------- |
| GET    | /veiculos/modelo/{modelo} |
| GET    | /veiculos/ano/{ano}       |
| GET    | /veiculos/preco/{preco}   |
| GET    | /veiculos/status/{status} |

---

# 🧪 Exemplo JSON – Cadastro de Veículo

```json
{
    "modelo": "Corolla",
    "ano": 2022,
    "cor": "Prata",
    "preco": 120000,
    "quilometragem": 15000,
    "status": "DISPONIVEL",
    "marca": {
        "id": 1
    }
}
```

---

# 🧱 Arquitetura Utilizada

O sistema foi desenvolvido utilizando arquitetura MVC:

* Model → Entidades do sistema
* Repository → Comunicação com banco de dados
* Service → Regras de negócio
* Controller → Endpoints REST

---

# 📖 Conceitos de POO Aplicados

✅ Encapsulamento
✅ Abstração
✅ Herança
✅ Polimorfismo

---

# 📷 Demonstração

Adicionar prints do:

* Projeto funcionando
* Endpoints no Postman
* Banco MySQL
* Cadastro de veículos
* Atualização
* Exclusão
* Consultas por filtro

---

# 🚀 Melhorias Futuras

* Frontend Web
* Login de usuários
* Controle de permissões
* Dashboard administrativo
* Upload de imagens
* Relatórios PDF

---

# 👨‍💻 Autor

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

Aluno(a): SEU NOME

---

# 📄 Licença

Este projeto possui finalidade acadêmica.

```
```
