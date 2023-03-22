------------ 01 ------------ 
create table empregado(
    nome_empregado varchar(50) constraint empregado_nome_empregado_nn not null,
    rua varchar(100) constraint empregado_rua_nn not null,
    cidade varchar(30),
    estado_civil varchar(15)
);

------------ 02 ------------ 
alter table empregado add (
    salario number(11,2)
);

------------ 03 ------------ 
alter table empregado add (
    data_nascimento date
);

------------ 04 ------------ 
alter table empregado modify (
    cidade varchar(110)
);

desc empregado

------------ 05 ------------ 
create table companhia(
    nome_companhia varchar(50) constraint companhia_nome_companhia_pk primary key,
    cidade varchar(30)
);

------------ 06 ------------ 
alter table empregado modify (
    nome_empregado varchar(110) constraint empregado_nome_empregado_pk primary key
);

desc empregado

------------ 07 ------------
create table trabalha(
    nome_empregado varchar(50) constraint trabalha_nome_empregado_pk primary key references empregado,
    nome_companhia varchar(50) constraint trabalha_nome_companhia_nn not null references companhia,
    salario number(9,2) constraint trabalha_salario_nn not null
);

------------ 08 ------------
create table gerente(
    nome_empregado varchar(50) constraint gerente_nome_empregado_nn not null references empregado,
    nome_gerente varchar(50) constraint gerente_nome_gerente_nn not null references empregado
);

commit;

------------ 09 ------------
drop table gerente;

select constraint_name, constraint_type from user_constraints where table_name = 'GERENTE'
