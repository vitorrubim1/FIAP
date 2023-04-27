-- INTEGRANTES: RM97092 (Vitor Rubim) & RM97068 (Gustavo Sorrilha)

-- 1
create table cds (
    codigo NUMBER(3) CONSTRAINT cds_codigo_pk PRIMARY KEY,
    nome VARCHAR(50) CONSTRAINT cds_nome_nn NOT NULL,
    dataCompra DATE CONSTRAINT cds_dataCompra_nn NOT NULL,
    valorPago NUMBER(8,2) CONSTRAINT cds_valorPago_nn NOT NULL,
    localCompra VARCHAR(20) CONSTRAINT cds_localCompra_nn NOT NULL,
    album CHAR(1) CONSTRAINT cds_album_nn NOT NULL
);

create table musicas (
    codigoCD NUMBER(3) CONSTRAINT musicas_codigo_fk REFERENCES cds,
    numero NUMBER(2) CONSTRAINT musicas_numero_nn NOT NULL,
    nome VARCHAR(50) CONSTRAINT musicas_nome_nn NOT NULL,
    artista VARCHAR(50) CONSTRAINT musicas_artista_nn NOT NULL,
    tempo NUMBER(4) CONSTRAINT musicas_tempo_nn NOT NULL
);

-- 2
INSERT INTO cds VALUES (001, 'CD-01', '11-jan-2002', 20.90, 'AMAZON', 'S');
INSERT INTO cds VALUES (002, 'CD-02', '20-jan-2005', 20.90, 'SUBMARINO', 'N');
INSERT INTO cds VALUES (003, 'CD-03', '15-jan-2007', 15.90, 'MERCADO LIVRE', 'S');
INSERT INTO cds VALUES (004, 'CD-04', '01-jan-2010', 30.00, 'SUBMARINO', 'N');

INSERT INTO musicas VALUES (001, 01, 'MUSICA-01', 'ARTISTA-01', 1);
INSERT INTO musicas VALUES (001, 02, 'MUSICA-02', 'ARTISTA-01', 2);

INSERT INTO musicas VALUES (002, 03, 'MUSICA-03', 'ARTISTA-02', 3);
INSERT INTO musicas VALUES (002, 04, 'MUSICA-04', 'ARTISTA-03', 4);

INSERT INTO musicas VALUES (003, 05, 'MUSICA-05', 'ARTISTA-01', 2);
INSERT INTO musicas VALUES (003, 06, 'MUSICA-06', 'ARTISTA-03', 6);

INSERT INTO musicas VALUES (004, 07, 'MUSICA-07', 'ARTISTA-02', 3);
INSERT INTO musicas VALUES (004, 08, 'MUSICA-08', 'ARTISTA-04', 1);

-- 3
SELECT nome, dataCompra FROM cds ORDER BY nome ASC;

-- 4
SELECT * FROM musicas WHERE codigoCD LIKE 001 AND tempo BETWEEN 2 and 3;

-- 5
SELECT numero, nome, tempo FROM musicas WHERE codigoCD LIKE 005 ORDER BY numero;

-- 6
SELECT nome FROM musicas WHERE artista LIKE 'José Pedro';

-- 7
SELECT nome FROM cds WHERE localcompra LIKE 'SUBMARINO';