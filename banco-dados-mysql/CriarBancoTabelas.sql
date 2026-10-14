-- Criar a base de dados para os estudos
CREATE DATABASE estudos_ads;

-- Selecionar a base de dados
USE estudos_ads;

-- Criar a tabela de clientes
CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    idade INT
);