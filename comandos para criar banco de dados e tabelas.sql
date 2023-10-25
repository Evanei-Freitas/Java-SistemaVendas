create database bd_sistema_vendas;

use bd_sistema_vendas;

-- criar a tabela de usuarios
create table tb_usuario(
idUsuario int(11) primary key auto_increment,
nome varchar(50) not null,
apelido varchar(50) not null,
usuario varchar(50) not null,
password varchar(15)Unique not null,
telefone varchar(15) not null,
estado int(1) not null
);

insert into tb_usuario(nome, apelido, usuario, password,telefone,estado)
values("Debora Freitas","binha","admin","binha","21994160998",1);

select *from tb_usuario;

select usuario, password from tb_usuario 
where usuario = "Evanei Freitas" and password = "admin";



-- criar a tabela cliente
create table tb_cliente(
idCliente int(11) primary key auto_increment,
nome varchar(50) not null,
apelido varchar(50) not null,
cpf varchar(50) not null,
telefone varchar(15) not null,
celular varchar(15) not null,
endereco varchar(150) not null,
estado varchar(1) not null
);

-- criar a tabela categoria
create table tb_categoria(
idCategoria int(11) primary key auto_increment,
descricao varchar(250) not null,
estado varchar(1) not null
);

-- criar a tabela produto - impostoIva( imposto sobre o valor agregado (IVA) )
create table tb_produto(
idProduto int(11) primary key auto_increment,
nome varchar(150) not null,
quantidade int(11) not null,
preco double(10,2) not null,
descricao varchar(200) not null,
porcentagemIva int(2) not null,
idCategoria int(11) not null,
estado varchar(1) not null
);


select p.idProduto, p.nome, p.quantidade, p.descricao, p.porcentagemIva, c.descricao, p.estado from tb_produto AS p, tb_categoria As c where p.idCategoria = c.idCategoria;




-- crear tabela vendas
create table tb_vendas(
idVendas int(11) primary key auto_increment,
idCliente int(11) not null,
valorPagar double(10,2) not null,
fecharVenda date not null,
estado varchar(1) not null
);


-- crear tabela detalhe da venda
create table tb_detalhe_venda(
idDetalheVenda int(11) primary key auto_increment,
idVendas int(11) not null,
idProduto int(11) not null,
quantidade int(11) not null,
precoUnitario double(10,2) not null,
subTotal double(10,2) not null,
desconto double(10,2) not null,
impostoIva double(10,2) not null,
totalPagar double(10,2) not null,
estado varchar(1) not null
);

show tables;
select * from tb_usuario;







