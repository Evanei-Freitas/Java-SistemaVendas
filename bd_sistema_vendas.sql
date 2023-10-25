-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 22-Out-2023 às 22:48
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `bd_sistema_vendas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_categoria`
--

CREATE TABLE `tb_categoria` (
  `idCategoria` int(11) NOT NULL,
  `descricao` varchar(250) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_categoria`
--

INSERT INTO `tb_categoria` (`idCategoria`, `descricao`, `estado`) VALUES
(1, 'Bebidas Alcoolicas', 1),
(2, 'Refrigerantes', 1),
(3, 'Mel de Abelha', 1),
(4, 'Computador', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_cliente`
--

CREATE TABLE `tb_cliente` (
  `idCliente` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `apelido` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `celular` varchar(15) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_detalhe_venda`
--

CREATE TABLE `tb_detalhe_venda` (
  `idDetalheVenda` int(11) NOT NULL,
  `idVendas` int(11) NOT NULL,
  `idProduto` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `precoUnitario` double(10,2) NOT NULL,
  `subTotal` double(10,2) NOT NULL,
  `desconto` double(10,2) NOT NULL,
  `impostoIva` double(10,2) NOT NULL,
  `totalPagar` double(10,2) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_produto`
--

CREATE TABLE `tb_produto` (
  `idProduto` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `preco` double(10,2) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `porcentagemIva` int(11) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_produto`
--

INSERT INTO `tb_produto` (`idProduto`, `nome`, `quantidade`, `preco`, `descricao`, `porcentagemIva`, `idCategoria`, `estado`) VALUES
(13, 'Guaraná Antártica', 15, 3.00, 'Litro', 12, 2, 1),
(16, 'Cerveja Antartica', 30, 3.00, 'Litro', 14, 1, 1),
(17, 'Guarana Brahma', 20, 2.00, 'Litro', 10, 2, 1),
(18, 'Cachaça', 1, 5.00, 'Litro', 20, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `idUsuario` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `apelido` varchar(50) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `password` varchar(15) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `tb_usuario`
--

INSERT INTO `tb_usuario` (`idUsuario`, `nome`, `apelido`, `usuario`, `password`, `telefone`, `estado`) VALUES
(1, 'Evanei reitas', 'William Nascimento', 'admin', 'admin', '21994160998', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_vendas`
--

CREATE TABLE `tb_vendas` (
  `idVendas` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `valorPagar` double(10,2) NOT NULL,
  `fecharVenda` date NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_categoria`
--
ALTER TABLE `tb_categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Índices para tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Índices para tabela `tb_detalhe_venda`
--
ALTER TABLE `tb_detalhe_venda`
  ADD PRIMARY KEY (`idDetalheVenda`);

--
-- Índices para tabela `tb_produto`
--
ALTER TABLE `tb_produto`
  ADD PRIMARY KEY (`idProduto`);

--
-- Índices para tabela `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`idUsuario`),
  ADD UNIQUE KEY `password` (`password`);

--
-- Índices para tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  ADD PRIMARY KEY (`idVendas`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `tb_categoria`
--
ALTER TABLE `tb_categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `tb_cliente`
--
ALTER TABLE `tb_cliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tb_detalhe_venda`
--
ALTER TABLE `tb_detalhe_venda`
  MODIFY `idDetalheVenda` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `tb_produto`
--
ALTER TABLE `tb_produto`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de tabela `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tb_vendas`
--
ALTER TABLE `tb_vendas`
  MODIFY `idVendas` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
