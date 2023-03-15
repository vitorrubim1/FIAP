------------ 01 ------------ 
create table cidade(
    codigo number(4) constraint cidade_codigo_pk primary key,
    nome varchar(30) constraint cidade_nome_nn not null
);

------------ 02 ------------ 
create table socio(
    cpf char(11) constraint socio_cpf_pk primary key,
    nome varchar(20) constraint socio_nome_nn not null,
    dataNasc date constraint socio_dataNasc_nn not null,
    rg varchar(15) constraint socio_rg_nn not null,
    cidade number(4) constraint socio_cidade_fk_nn not null references cidade
);

select * from socio;

------------ 03 ------------ 
alter table cidade add (
    uf char(2) constraint cidade_uf_nn not null
);

------------ 04 ------------ 
alter table socio add (
    fone varchar(10),
    sexo char(1)  constraint socio_sexo_nn not null
);

------------ 05 ------------
alter table socio modify (
    nome varchar(35)
);

------------ 06 ------------
create table setor(
    codigo number(3) constraint setor_codigo_pk primary key,
    nome varchar(30) constraint setor_nome_nn not null
);

select * from setor;

------------ 07 ------------
alter table socio add (
    setor number(3) constraint socio_setor_fk_nn not null references setor
);

------------ 08 ------------
create table dependente (
    socio char(11) constraint dependente_socio_fk_nn not null references socio,
    numero number(4) constraint dependente_numero_pk primary key,
    nome varchar(30) constraint dependente_nome_nn not null,
    dataNasc date constraint dependente_dataNasc_nn not null
);

select * from dependente;

------------ 08 ------------ 
-- Cidade
desc cidade;
insert into cidade values(1, 'São Paulo', 'SP');
insert into cidade values(2, 'Curitiba', 'CB');
select * from cidade;

-- Setor
desc setor;
insert into setor values(10, 'Financeiro');
insert into setor values(20, 'Informática');
select * from setor;

-- Socio
desc socio
insert into socio values('12345678911', 'Joana', '04-may-1997', '123456789123456', 1, '1234567891', 'M', 20);
insert into socio values('12345678912', 'Vitor', '11-may-2002', '123456789123456', 1, '1234567891', 'M', 20);
select * from socio;

-- Dependente
desc dependente
insert into dependente values('12345678911',100,'Gustavo','26-feb-00');
insert into dependente values('12345678912',101,'Mariana','06-mar-10');
select * from dependente;

commit;

-- Regra para visualizar constraint da tabela
select constraint_name, constraint_type from user_constraints where table_name = 'DEPENDENTE'


