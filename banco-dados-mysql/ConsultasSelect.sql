-- Usar a base de dados
USE estudos_ads;

-- Selecionar todos os registos da tabela
SELECT * FROM clientes;

-- Consultar apenas clientes com idade maior ou igual a 22 anos
SELECT nome, email FROM clientes WHERE idade >= 22;

-- Consultar ordenando por nome em ordem alfabética
SELECT * FROM clientes ORDER BY nome ASC;