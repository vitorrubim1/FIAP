SET SERVEROUTPUT ON;

-- ******* Tratamento de erros *******

DROP TABLE aluno CASCADE CONSTRAINTS;

CREATE TABLE aluno (
    ra NUMBER(1) PRIMARY KEY, 
    nome VARCHAR2(20)
);

INSERT INTO aluno VALUES(1, 'Vitor');
INSERT INTO aluno VALUES(2, 'Gustavo');
INSERT INTO aluno VALUES(3, 'Natan');

COMMIT;


-- 1° EXEMPLO:
BEGIN
    INSERT INTO aluno VALUES(1, 'Vitor');
    
    -- exception por VALORES DUPLICADOS
    EXCEPTION 
    WHEN dup_val_on_index THEN
    dbms_output.put_line('OPERAÇÃO INVÁLIDA');
END;


-- 2° EXEMPLO:
DECLARE
    V_RA ALUNO.RA%TYPE := 1;
    V_NOME ALUNO.NOME%TYPE;
BEGIN
    SELECT nome INTO V_NOME FROM aluno WHERE ra > V_RA;
    dbms_output.put_line(V_RA || ' - ' || V_NOME);
    
    EXCEPTION
        -- exception por NÃO ENCOTRAR VALORES
        WHEN NO_DATA_FOUND THEN
            dbms_output.put_line('Não há aluno com este RA');
        WHEN TOO_MANY_ROWS THEN
                dbms_output.put_line('Há mais de um aluno com este RA');
END;


-- 3° EXEMPLO (ERRO GENERICO)
DECLARE
    V_RA ALUNO.RA%TYPE := 1;
    V_NOME ALUNO.NOME%TYPE;
BEGIN
    SELECT nome INTO V_NOME FROM aluno WHERE ra > V_RA;
    dbms_output.put_line(V_RA || ' - ' || V_NOME);
    
    EXCEPTION
        WHEN OTHERS THEN
            dbms_output.put_line('Deu erro, se vira.'); 
END;


-- 4º EXEMPLO:
DECLARE
    V_CONTA NUMBER(2);
    TURMA_CHEIA EXCEPTION;
BEGIN
    SELECT COUNT(RA) INTO V_CONTA FROM aluno;
    
    IF V_CONTA = 4 THEN
        RAISE TURMA_CHEIA; -- DOU EXCEPTION PERSONALIZADA
    ELSE 
        INSERT INTO aluno VALUES(5, 'Marcel');
    END IF;
    
    EXCEPTION
        WHEN TURMA_CHEIA THEN
            dbms_output.put_line('Não foi possível incluir: turma cheia'); 
END;
