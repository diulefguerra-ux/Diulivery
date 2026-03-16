DROP DATABASE IF EXISTS diulivery;
CREATE DATABASE diulivery;
USE diulivery;

CREATE TABLE prato (
    idprato INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE categoria (
    idCategoria INT PRIMARY KEY AUTO_INCREMENT,
    nome_Categoria VARCHAR(50) NOT NULL,
    prato_idprato INT,
    FOREIGN KEY (prato_idprato) REFERENCES prato(idprato) ON DELETE CASCADE
);

CREATE TABLE cliente (
    idcliente INT PRIMARY KEY AUTO_INCREMENT,
    nome_cliente VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE pedido (
    idpedido INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status_pedido VARCHAR(45) DEFAULT 'Pendente',
    cliente_idcliente INT,
    prato_idprato INT,
    FOREIGN KEY (cliente_idcliente) REFERENCES cliente(idcliente),
    FOREIGN KEY (prato_idprato) REFERENCES prato(idprato)
);

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS pedido;
DROP TABLE IF EXISTS categoria;
DROP TABLE IF EXISTS prato;
DROP TABLE IF EXISTS cliente;

SET FOREIGN_KEY_CHECKS = 1;

CREATE TABLE prato (
    idprato INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    preco DECIMAL(10,2) NOT NULL
);

CREATE TABLE categoria (
    idCategoria INT PRIMARY KEY AUTO_INCREMENT,
    nome_Categoria VARCHAR(50) NOT NULL,
    prato_idprato INT,
    FOREIGN KEY (prato_idprato) REFERENCES prato(idprato) ON DELETE CASCADE
);

CREATE TABLE cliente (
    idcliente INT PRIMARY KEY AUTO_INCREMENT,
    nome_cliente VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE pedido (
    idpedido INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status_pedido VARCHAR(45) DEFAULT 'Pendente',
    cliente_idcliente INT,
    prato_idprato INT,
    FOREIGN KEY (cliente_idcliente) REFERENCES cliente(idcliente),
    FOREIGN KEY (prato_idprato) REFERENCES prato(idprato)
);


USE diulivery;

CREATE TABLE usuario (
    idusuario INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    senha VARCHAR(50)
);

INSERT INTO usuario (nome, email, senha) 
VALUES ('Diule', 'diule@email.com', '123456');

INSERT INTO usuario (nome, email, senha) 
VALUES ('Diule', 'diule@email.com', '123456');

INSERT INTO cliente (nome_cliente, email, senha) 
VALUES ('Diule', 'diule@email.com', '123456');