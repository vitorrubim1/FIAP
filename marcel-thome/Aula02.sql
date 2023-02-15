------------ CATEGORIA ------------ 
create table categoria(
    Codcateg number(4) constraint categoria_Codcateg_pk primary key,
    Descricao varchar(50) constraint categoria_Descricao_nn not null
);

insert into categoria values (1, 'Comédia');
insert into categoria values (2, 'Drama');
insert into categoria values (3, 'Aventura');
insert into categoria values (4, 'Terror');
select * from categoria;

------------ RELACIONAMENTO (ATOR - FILME) ------------ 
create table estrela(
    fk_ator number(4) constraint ator_fk references ator,
    fk_filme number(4) constraint filme_fk references filme 
);

drop table estrela;

------------ ATOR ------------ 
create table ator(
    Codator  number(4) constraint ator_Codator_pk primary key,
    Nome_popular varchar(50) constraint ator_Nome_popular_nn not null,
    nullNome_artistico varchar(50),
    Datanasc date
);

------------ FILME ------------ 
create table filme(
    CodFilme number(4) constraint filme_CodFilme_pk primary key,
    Titulo varchar(70) constraint filme_Titulo_nn not null,
    fk_categoria number(4) constraint categoria_fk references categoria
);

insert into filme values (1, 'Sai pra lá', 1);
insert into filme values (2, 'Ajuda Eterna', 2);
insert into filme values (3, 'Anjos Malditos', 2);
insert into filme values (4, ' Pânico II', 4);
insert into filme values (5, 'Um dia de furia', 3);
insert into filme values (6, 'Lente Cega', 3);
insert into filme values (7, 'Sinais do Tempo', 2);
insert into filme values (8, 'A melodia da vida', 1);

select * from filme;

------------ RELACIONAMENTO (CLIENTE - DVD  ) ------------ 
create table aluga(
    fk_cliente number(4) constraint cliente_fk references cliente,
    fk_dvd number(4) constraint dvd_fk references dvd,
    DataRet date,
    DataDev date
);

------------ Cliente ------------ 
create table cliente(
    CodCli number(4) constraint cliente_CodCli_pk primary key,
    Prenome varchar(50) constraint cliente_Prenome_nn not null,
    Sobrenome varchar(50),
    Endereco varchar(70),
    Telefone varchar(20)
);

insert into cliente values (1, 'João', 'Silva', 'Rua da Cruz sem Pé', '4444-1111');
insert into cliente values (2, 'Antônio', 'Ferreira', 'Av. da Vila Velha', '6660-9333');
insert into cliente values (3, 'Fabio', 'Dias', 'Rua Antonio Vieira', '2337-0393');
insert into cliente values (4, 'Andreia', 'Melo', 'Rua da Praia Bonita', '8989-7777');
insert into cliente values (5, 'Murilo ', 'Fontes', 'Av. dos Autonomistas', '9090-9090');

select * from cliente;

------------ DVD ------------ 
create table dvd(
    NumDVD number(4) constraint dvd_NumDVD_pk primary key,
    Tipo char(1)
);




