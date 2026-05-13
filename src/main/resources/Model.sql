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


INSERT INTO marca (nome) VALUES ('Toyota');
INSERT INTO marca (nome) VALUES ('Honda');
INSERT INTO marca (nome) VALUES ('Volkswagen');
INSERT INTO marca (nome) VALUES ('Ford');

INSERT INTO veiculo (modelo, ano, cor, preco, quilometragem, status, marca_id)
VALUES ('Corolla', 2023, 'Prata', 150000.00, 0, 'DISPONIVEL', 1);

INSERT INTO veiculo (modelo, ano, cor, preco, quilometragem, status, marca_id)
VALUES ('Civic', 2022, 'Preto', 145000.00, 15000.5, 'DISPONIVEL', 2);

INSERT INTO veiculo (modelo, ano, cor, preco, quilometragem, status, marca_id)
VALUES ('Golf', 2021, 'Branco', 120000.00, 30000.0, 'VENDIDO', 3);

INSERT INTO veiculo (modelo, ano, cor, preco, quilometragem, status, marca_id)
VALUES ('Mustang', 1969, 'Vermelho', 350000.00, 80000.0, 'DISPONIVEL', 4);