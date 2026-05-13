CREATE DATABASE sistema_veiculos;

USE sistema_veiculos;

CREATE TABLE marca (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100)
);

CREATE TABLE veiculo (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    modelo VARCHAR(100),
    ano INT,
    cor VARCHAR(50),
    preco DOUBLE,
    quilometragem DOUBLE,
    status VARCHAR(30),
    marca_id BIGINT,

    CONSTRAINT fk_marca
    FOREIGN KEY (marca_id)
    REFERENCES marca(id)
);