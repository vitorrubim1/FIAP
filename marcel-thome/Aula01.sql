------------ CARGO ------------
create table cargo(
    id_cargo number(3) primary key,
    nome_cargo varchar2(25) not null unique,
    salario number(8,2)
);

desc cargo;
drop table cargo;

------------ FUNCIONÁRIO ------------
create table funcionario(
    id number(3) constraint funcionario_id_pk primary key,
    nome varchar(30) constraint funconario_nome_nn not null,
    data_admissao date constraint funcionario_data_admissao_nn not null,
    uf char(2) constraint funcionario_uf_nn not null,
    cargo_fk number(3) constraint funcionario_cargo_fk references cargo
);

desc funcionario;

------------ NOTAL FISCAL ------------ 
create table nota_fiscal(
    numero_nota number(5) primary key,
    data_nota date not null,
    total_nota number(10,2)
)

desc nota_fiscal;
insert into nota_fiscal values (1, '10-Jan-00', 5000);
select * from nota_fiscal;

------------ PRODUTO ------------ 
create table produto(
    cd_pro number(5) constraint produto_cd_pro_pk primary key,
    nome_produto varchar2(30) constraint produto_nome_produto_nn not null constraint produto_nome_produto_uk unique,
    preco number(10,2)
);

------------ TEM ------------ 
create table tem(
   fk_nota number(5) constraint tem_nota_fk references nota_fiscal,
   fk_produto number(5) constraint tem_produto_fk references produto
);
