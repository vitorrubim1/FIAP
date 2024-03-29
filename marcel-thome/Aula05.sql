CREATE TABLE cliente(
    cod_clie NUMBER(4) CONSTRAINT cliente_cod_clie_pk PRIMARY KEY,
    nome_clie VARCHAR2(20) CONSTRAINT cliente_nome_clie_nn NOT NULL,
    endereco VARCHAR2(30),
    cidade VARCHAR2(15),
    cep CHAR(8),
    uf CHAR(2),
    cnpj CHAR(16),
    ie CHAR(12)
);

INSERT INTO cliente values(720, 'Ana', 'Rua 17 n.19', 'Niterói', '24358310', 'RJ', '12113231/0001-34', '2134');
INSERT INTO cliente values(870, 'Flávio', 'Av. Pres. Vargas, 10', 'São Paulo', '22763931', 'SP', '22534126/9387-9', '4631');
INSERT INTO cliente values(110, 'Jorge', 'Rua Caiapó 13', 'Curitiba', '30078500', 'PR', '14512764/9834-9', null);
INSERT INTO cliente values(222, 'Lúcia', 'Rua Itabira, 123', 'Belo Horizonte', '22124391', 'MG', '283152123/9348-8', '2985');
INSERT INTO cliente values(830, 'Mauricio', 'Av. Paulista, 1236', 'São Paulo', '3012683', 'SP', '32816985/7465-6', '9343');
INSERT INTO cliente values(130, 'Edmar', 'Rua da Praia, s/n', 'Salvador', '30079300', 'BA', '23463284/234-9', '7121');
INSERT INTO cliente values(410, 'Rodolfo', 'Largo da Lapa 27', 'Rio de Janeiro', '30078900', 'RJ', '12835128/2346-9', '7431');
INSERT INTO cliente values(20, 'Beth', 'Av. Climério, 45', 'São Paulo', '25679300', 'SP', '32485126/7326-8', '9280');
INSERT INTO cliente values(157, 'Paulo', 'Trav. Moraes, casa 3', 'Londrina', null, 'PR', '32848223/324-2', '1923');
INSERT INTO cliente values(180, 'Lívio', 'Av. Beira Mar, 1256', 'Florianópolis', '30077500', 'SC', '12736571/2347-4', '1111');
INSERT INTO cliente values(260, 'Susana', 'Rua Lopes Mandes, 12', 'Niterói', '30046500', 'RJ', '21763571/232-9', '2530');
INSERT INTO cliente values(290, 'Renato', 'Rua Meireles, 123', 'São Paulo', '30225900', 'SP', '13276571/1231-4', '1820');
INSERT INTO cliente values(390, 'Sebastião', 'Rua da Igreja, 10', 'Uberaba', '30438700', 'MG', '32176547/213-3', '9071');
INSERT INTO cliente values(234, 'José', 'Quadra 3, Bl. 3, sl. 1003', 'Brasília', '22841650', 'DF', '21763576/1232-3', '2931');

select * from cliente;

CREATE TABLE vendedor(
    cod_ven NUMBER(4) CONSTRAINT vendedor_cod_ven_pk PRIMARY KEY,
    nome_ven VARCHAR2(20) CONSTRAINT vendedor_nome_ven_nn NOT NULL,
    salario_fixo NUMBER(10,2) CONSTRAINT vendedor_salario_fixo_nn NOT NULL,
    comissao char(1)
);

INSERT INTO vendedor VALUES (209, 'José', 1800, 'C');
INSERT INTO vendedor VALUES (111, 'Carlos', 2490, 'A');
INSERT INTO vendedor VALUES (11, 'João', 2780, 'C');
INSERT INTO vendedor VALUES (240, 'Antônio', 9500, 'C');
INSERT INTO vendedor VALUES (720, 'Felipe', 4600, 'A');
INSERT INTO vendedor VALUES (213, 'Jonas', 2300, 'A');
INSERT INTO vendedor VALUES (101, 'João', 2650, 'C');
INSERT INTO vendedor VALUES (310, 'Josias', 870, 'B');
INSERT INTO vendedor VALUES (250, 'Maurício', 2930, 'B');

select * from vendedor;

-- Ajuste de 10% de todos salarios
select salario_fixo "Salario atual", salario_fixo * 1.1 "Salario reajustado 10%" from vendedor;

CREATE TABLE produto(
    cod_prod NUMBER(4) CONSTRAINT produto_cod_prod_pk PRIMARY KEY,
    unidade VARCHAR2(3),
    descricao VARCHAR2(20),
    val_unit NUMBER(8,2)
);

INSERT INTO produto VALUES (25, 'KG', 'Queijo', 0.97);
INSERT INTO produto VALUES (31, 'BAR', 'Chocolate', 0.87);
INSERT INTO produto VALUES (78, 'L', 'Vinho', 2.00);
INSERT INTO produto VALUES (22, 'M', 'Linho', 0.11);
INSERT INTO produto VALUES (30, 'SAC', 'Açúcar', 0.30);
INSERT INTO produto VALUES (53, 'M', 'Linha', 1.80);
INSERT INTO produto VALUES (13, 'G', 'Ouro', 6.18);
INSERT INTO produto VALUES (45, 'M', 'Madeira', 0.25);
INSERT INTO produto VALUES (87, 'M', 'Cano', 1.97);
INSERT INTO produto VALUES (77, 'M', 'Papel', 1.05);

select * from produto;

CREATE TABLE pedido(
    num_pedido NUMBER(4) CONSTRAINT pedido_num_pedido_pk PRIMARY KEY,
    pr_entrega NUMBER(3) CONSTRAINT pedido_pr_entrega_nn NOT NULL,
    cod_clie NUMBER(4) CONSTRAINT pedido_cod_clie_fk references cliente,
    cod_ven NUMBER(4) CONSTRAINT pedido_cod_ven_fk references vendedor
);

INSERT INTO pedido VALUES (121, 20, 410, 209);
INSERT INTO pedido VALUES (97, 20, 720, 101);
INSERT INTO pedido VALUES (101, 15, 720, 101);
INSERT INTO pedido VALUES (137, 20, 720, 720);
INSERT INTO pedido VALUES (148, 20, 720, 101);
INSERT INTO pedido VALUES (189, 15, 870, 213);
INSERT INTO pedido VALUES (104, 30, 110, 101);
INSERT INTO pedido VALUES (203, 30, 830, 250);
INSERT INTO pedido VALUES (98, 20, 410, 209);
INSERT INTO pedido VALUES (143, 30, 20, 111);
INSERT INTO pedido VALUES (105, 30, 180, 240);
INSERT INTO pedido VALUES (111, 15, 260, 240);
INSERT INTO pedido VALUES (103, 20, 260, 11);
INSERT INTO pedido VALUES (91, 20, 260, 11);
INSERT INTO pedido VALUES (138, 20, 260, 11);
INSERT INTO pedido VALUES (108, 15, 290, 310);
INSERT INTO pedido VALUES (119, 30, 390, 250);
INSERT INTO pedido VALUES (127, 10, 410, 11);

select * from pedido;

CREATE TABLE item_pedido(
    num_pedido NUMBER(4) CONSTRAINT item_pedido_num_pedido_fk REFERENCES pedido,
    cod_prod NUMBER(4) CONSTRAINT item_pedido_cod_prod_fk REFERENCES produto, 
    quant NUMBER(8,2)
);

INSERT INTO item_pedido VALUES(121,25,10);
INSERT INTO item_pedido VALUES(121,31,35);
INSERT INTO item_pedido VALUES(97,77,20);
INSERT INTO item_pedido VALUES(101,31,9);
INSERT INTO item_pedido VALUES(101,78,18);
INSERT INTO item_pedido VALUES(101,13,5);
INSERT INTO item_pedido VALUES(98,77,5);
INSERT INTO item_pedido VALUES(148,45,8);
INSERT INTO item_pedido VALUES(148,31,7);
INSERT INTO item_pedido VALUES(148,77,3);
INSERT INTO item_pedido VALUES(148,25,10);
INSERT INTO item_pedido VALUES(148,78,30);
INSERT INTO item_pedido VALUES(104,53,32);
INSERT INTO item_pedido VALUES(203,31,6);
INSERT INTO item_pedido VALUES(189,78,45);
INSERT INTO item_pedido VALUES(143,31,20);
INSERT INTO item_pedido VALUES(143,78,10);

SELECT * FROM item_pedido;

SELECT nome_clie, uf FROM cliente WHERE uf = 'SP';

SELECT descricao, val_unit FROM produto WHERE val_unit < 1.5 ORDER BY val_unit;
SELECT num_pedido, cod_clie FROM pedido WHERE cod_clie > 500 ORDER BY cod_clie;
SELECT cod_clie, nome_clie FROM cliente WHERE cod_clie >= 180 AND cod_clie <= 720 order by cod_clie; -- inclusive
SELECT cod_clie, nome_clie FROM cliente WHERE cod_clie > 180 AND cod_clie < 720 order by cod_clie;
SELECT nome_clie FROM cliente WHERE UPPER(nome_clie) >= 'B' AND UPPER(nome_clie) <= 'G' ORDER BY nome_clie; -- inclusive até "g" pq se não "f" não exibiria
SELECT * FROM vendedor WHERE salario_fixo > 2000 AND comissao != 'B' AND cod_ven > 500 AND cod_ven < 800;

-- between
SELECT cod_clie, nome_clie FROM cliente WHERE cod_clie BETWEEN 180 and 720 ORDER BY cod_clie;
SELECT cod_clie, nome_clie FROM cliente WHERE cod_clie NOT BETWEEN 180 and 720 ORDER BY cod_clie;

-- in
SELECT nome_clie, uf FROM cliente WHERE uf IN('SP', 'RJ', 'MG') ORDER BY uf;
SELECT nome_clie, uf FROM cliente WHERE uf NOT IN('SP', 'RJ', 'MG') ORDER BY uf;


-- % = qualquer quantidade, qualquer posição. _ = posição e quantidade específica
-- 'A%' = Começa com "A". '%a' = Termina com "a". '_ _r%' = terceira letra é "R". '%A%' = que possue letra "a" no nome
SELECT nome_clie FROM cliente WHERE UPPER(nome_clie) LIKE '%A%';

SELECT nome_clie FROM cliente WHERE UPPER(nome_clie) LIKE '%O%';
SELECT nome_clie FROM cliente WHERE UPPER(nome_clie) NOT LIKE '%M';

select count(*) from produto;
-- total de registros

select round(avg(salario_fixo),2) from vendedor; 
-- round arredonda 1° posição após limite >= 5, + 1 a esquerda

select salario_fixo/1.3, round(salario_fixo/1.3, 2), trunc (salario_fixo/1.3, 2) from vendedor;
-- trunc despreza casas decimais, sem arredondamento

select sum(salario_fixo) from vendedor;

select max(salario_fixo) from vendedor;
select min(salario_fixo) from vendedor;
-- maior e menor valor da coluna

SELECT MAX(val_unit) "Maior preço", MIN(val_unit) "Menor preço" from produto;
SELECT COUNT(cod_clie) FROM cliente WHERE cidade = 'São Paulo';
SELECT COUNT(num_pedido) "Total pedidos"  FROM pedido WHERE cod_clie = 720;
SELECT ROUND(AVG(salario_fixo), 2) FROM vendedor WHERE comissao = 'A';
SELECT SUM(salario_fixo) FROM vendedor WHERE comissao = 'C';
SELECT nome_ven, salario_fixo from vendedor WHERE salario_fixo IN (SELECT MAX(salario_fixo) FROM vendedor);

-- group by
SELECT uf, COUNT(cod_clie) FROM cliente GROUP BY uf ORDER BY 1;
SELECT comissao, COUNT(cod_ven) FROM vendedor GROUP BY comissao ORDER BY 1;
SELECT cod_clie, COUNT(num_pedido) FROM pedido GROUP BY cod_clie ORDER BY 1;
SELECT num_pedido, COUNT(cod_prod) FROM item_pedido GROUP BY num_pedido ORDER BY 1;
SELECT cod_clie, COUNT(num_pedido) FROM pedido GROUP BY cod_clie HAVING COUNT(num_pedido) > 1 ORDER BY 1;
-- HAVING É USADO COM GROUP BY

SELECT nome_ven, salario_fixo FROM vendedor WHERE salario_fixo > (SELECT AVG(salario_fixo) FROM vendedor);




-- Exibe formato da data do PC
SELECT sysdate FROM dual;

-- Alterando e atualizando todos registros
ALTER TABLE vendedor ADD dt_adm DATE DEFAULT sysdate;
ALTER TABLE vendedor ADD dt_dem DATE DEFAULT sysdate;

SELECT sysdate AS "DATA ATUAL", sysdate + 400 AS "DATA ATUAL COM + 400 DIAS", sysdate - 400 AS "DATA ATUAL COM - 400 DIAS" FROM dual;

UPDATE vendedor SET dt_adm = dt_adm - 3580 WHERE comissao = 'A';
UPDATE vendedor SET dt_adm = dt_adm - 6580 WHERE comissao = 'B';
UPDATE vendedor SET dt_adm = dt_adm - 13580 WHERE comissao = 'C';
UPDATE vendedor SET dt_dem = dt_dem - 18 WHERE nome_ven = 'Felipe';
UPDATE vendedor SET dt_dem = null WHERE cod_ven BETWEEN 101 AND 310;
UPDATE vendedor SET dt_dem = dt_dem - 67 WHERE nome_ven = 'João' AND cod_ven = 11;
SELECT nome_ven, dt_adm FROM vendedor;


-- INER JOIN

CREATE TABLE cargo(
    cd_cargo NUMBER(2) CONSTRAINT cargo_cd_cargo_pk PRIMARY KEY,
    nm_carg VARCHAR(30),
    salario NUMBER(8,2)
);

INSERT INTO cargo VALUES (1, 'Prg. Web', 4500);
INSERT INTO cargo VALUES (2, 'DBA', 12000);
INSERT INTO cargo VALUES (3, 'Analista Dados', 8000);

SELECT * FROM cargo;

CREATE TABLE funcionario (
 id_fun NUMBER(2) CONSTRAINT funcionario_id_fun_nn_pk NOT NULL PRIMARY KEY,    
 nm_fun VARCHAR2(20) CONSTRAINT funcionario_nm_fun_nn NOT NULL ,
 cargo NUMBER(2) CONSTRAINT funcionario_cd_cargo_fk REFERENCES cargo
);

INSERT INTO funcionario VALUES (10, 'Marcel', 1);
INSERT INTO funcionario VALUES (11, 'Claudio', 2);
INSERT INTO funcionario VALUES (12, 'Amanda', 2);
INSERT INTO funcionario VALUES (13, 'Samantha', null);

SELECT * FROM funcionario;

SELECT nm_fun, nm_carg FROM cargo INNER JOIN funcionario ON cd_cargo = cargo;
SELECT nm_fun, nm_carg FROM cargo LEFT JOIN funcionario ON cd_cargo = cargo;
SELECT nm_fun, nm_carg FROM cargo RIGHT JOIN funcionario ON cd_cargo = cargo;
SELECT nm_fun, nm_carg FROM cargo RIGHT JOIN funcionario ON cd_cargo = cargo WHERE cargo is null;
SELECT nm_fun, nm_carg FROM cargo LEFT JOIN funcionario ON cd_cargo = cargo WHERE cargo is null;
SELECT nm_fun, nm_carg FROM cargo FULL OUTER JOIN funcionario ON cd_cargo = cargo WHERE cargo is null;
SELECT nome_clie, num_pedido FROM cliente INNER JOIN pedido ON cliente.cod_clie = pedido.cod_clie; -- quando os atributos de pk e fk são iguais adiciona o nome da tabela antes(qualificador). 
SELECT nome_ven, num_pedido FROM vendedor INNER JOIN pedido ON pedido.cod_ven = vendedor.cod_ven;

SELECT nome_ven, num_pedido, nome_clie FROM pedido 
INNER JOIN vendedor ON pedido.cod_ven = vendedor.cod_ven 
INNER JOIN cliente ON pedido.cod_clie = cliente.cod_clie;

commit;













