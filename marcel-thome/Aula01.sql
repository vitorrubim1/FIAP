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