-- RM97092 VITOR RUBIM
-- RM97068 GUSTAVO SORRILHA

set SERVEROUTPUT on;

DROP TABLE projeto CASCADE CONSTRAINTS;
DROP TABLE funcionario CASCADE CONSTRAINTS;
DROP TABLE aloca CASCADE CONSTRAINTS;

CREATE TABLE projeto(
    id_proj number(8) primary key,
    nome_proj varchar2(255),
    vlr_por_hora number(10,2)
);


CREATE TABLE funcionario(
    id_fun number(8) primary key,
    nome_func varchar2(255)
);


CREATE TABLE aloca(
    dt_inicio date,
    dt_fim date,
    dias_trabalhado number(8),
    fk_id_fun references funcionario,
    fk_id_proj references projeto
);

-- exercicio 01
DECLARE
    -- func
    v_nome_func VARCHAR2(255) := 'Gustavo';

    -- alocação
    v_dt_inicio DATE := TO_DATE('2023-10-09', 'YYYY-MM-DD');
    v_dt_fim DATE := TO_DATE('2024-05-09', 'YYYY-MM-DD');
    v_dias_trabalhados NUMBER(8) := 10;

    -- projeto
    v_nome_proj VARCHAR2(255) := 'fiap';

    v_id_func NUMBER(8);
    v_id_proj NUMBER(8);

    funcionario_existe NUMBER(3);
    projeto_existe NUMBER(3);
    alocacao_existe NUMBER(3);

    FUNC_EXIST EXCEPTION;
    PROJ_EXIST EXCEPTION;
    ALOC_EXIST EXCEPTION;
BEGIN
    BEGIN
        SELECT id_fun INTO v_id_func
        FROM funcionario
        WHERE nome_func = v_nome_func;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            v_id_func := NULL;
    END;

    BEGIN
        SELECT id_proj INTO v_id_proj
        FROM projeto
        WHERE nome_proj = v_nome_proj;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            v_id_proj := NULL;
    END;

    SELECT COUNT(*) INTO alocacao_existe
    FROM aloca
    WHERE fk_id_fun = v_id_func AND fk_id_proj = v_id_proj;

    IF funcionario_existe > 0 THEN
        RAISE FUNC_EXIST;
    ELSIF projeto_existe > 0 THEN
        RAISE PROJ_EXIST;
    ELSIF alocacao_existe > 0 THEN
        RAISE ALOC_EXIST;
    ELSE
        IF v_id_func IS NULL THEN
            INSERT INTO funcionario (id_fun, nome_func)
            VALUES (funcionario_seq.NEXTVAL, v_nome_func);
        END IF;

        IF v_id_proj IS NULL THEN
            INSERT INTO projeto (id_proj, nome_proj, vlr_por_hora)
            VALUES (projeto_seq.NEXTVAL, v_nome_proj, 0); -- Defina o valor de vlr_por_hora conforme necessário
        END IF;

        INSERT INTO aloca (dt_inicio, dt_fim, dias_trabalhado, fk_id_fun, fk_id_proj)
        VALUES (v_dt_inicio, v_dt_fim, v_dias_trabalhados, v_id_func, v_id_proj);

        DBMS_OUTPUT.PUT_LINE('Cadastro realizado com sucesso!');
    END IF;

EXCEPTION
    WHEN FUNC_EXIST THEN
        DBMS_OUTPUT.PUT_LINE('Funcionário já existe!');

    WHEN PROJ_EXIST THEN
        DBMS_OUTPUT.PUT_LINE('Projeto já existe!');

    WHEN ALOC_EXIST THEN
        DBMS_OUTPUT.PUT_LINE('Alocação já existe!');

    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Um erro ocorreu: ' || SQLERRM);
END;


-- EXERCICIO 02
DECLARE
    v_id_func NUMBER(8);
    v_nome_func VARCHAR2(255) := 'Gustavo';
    v_dt_hoje DATE := SYSDATE;
    
    CURSOR c_projetos_func IS
        SELECT p.nome_proj, a.dt_inicio, a.dt_fim
        FROM aloca a
        INNER JOIN projeto p ON a.fk_id_proj = p.id_proj
        WHERE a.fk_id_fun = v_id_func;
    
    v_projeto_nome VARCHAR2(255);
    v_tempo_projeto NUMBER(8);
    v_salario_hoje NUMBER(10, 2);
BEGIN
    SELECT id_fun INTO v_id_func
    FROM funcionario
    WHERE nome_func = v_nome_func;
    
    DBMS_OUTPUT.PUT_LINE('Nome do Funcionário: ' || v_nome_func);
    
    v_tempo_projeto := 0;
    
    FOR projeto_rec IN c_projetos_func
    LOOP
        v_projeto_nome := projeto_rec.nome_proj;
        
        IF projeto_rec.dt_fim IS NOT NULL THEN
            v_tempo_projeto := v_tempo_projeto + (projeto_rec.dt_fim - projeto_rec.dt_inicio);
        ELSE
            v_tempo_projeto := v_tempo_projeto + (v_dt_hoje - projeto_rec.dt_inicio);
        END IF;
        
        IF projeto_rec.dt_fim IS NULL OR projeto_rec.dt_fim >= v_dt_hoje THEN
            DBMS_OUTPUT.PUT_LINE('Projeto: ' || v_projeto_nome || ', Tempo no Projeto: ' || v_tempo_projeto || ' dias, Ainda está no Projeto: Sim');
        ELSE
            DBMS_OUTPUT.PUT_LINE('Projeto: ' || v_projeto_nome || ', Tempo no Projeto: ' || v_tempo_projeto || ' dias, Ainda está no Projeto: Não');
        END IF;
    END LOOP;
    
    SELECT SUM(p.vlr_por_hora * v_tempo_projeto / 24) INTO v_salario_hoje
    FROM projeto p
    WHERE p.id_proj IN (SELECT a.fk_id_proj FROM aloca a WHERE a.fk_id_fun = v_id_func);
    
    DBMS_OUTPUT.PUT_LINE('Salário Hoje: R$ ' || TO_CHAR(v_salario_hoje, '9999.99'));
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('Funcionário não encontrado.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Um erro ocorreu: ' || SQLERRM);
END;



-- EXERCÍCIO 03
DECLARE
    v_data_atual DATE := SYSDATE;
BEGIN
    DBMS_OUTPUT.PUT_LINE('Projetos em andamento:');
    FOR proj IN (SELECT p.nome_proj
                 FROM projeto p
                 JOIN aloca a ON p.id_proj = a.fk_id_proj
                 WHERE a.dt_fim >= v_data_atual) LOOP
        DBMS_OUTPUT.PUT_LINE(proj.nome_proj);
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('Projetos encerrados:');
    FOR proj IN (SELECT p.nome_proj
                 FROM projeto p
                 JOIN aloca a ON p.id_proj = a.fk_id_proj
                 WHERE a.dt_fim < v_data_atual) LOOP
        DBMS_OUTPUT.PUT_LINE(proj.nome_proj);
    END LOOP;
END;



SELECT * FROM funcionario;
SELECT * FROM projeto;
SELECT * FROM aloca;

