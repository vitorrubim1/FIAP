/* Aula 01 - Introdução blocos anônimos */

/* Habilitando a saída de dados de um block PL */
SET SERVEROUTPUT ON

/* 1° Programa */
BEGIN
    dbms_output.put_line('Hello world');
    DBMS_OUTPUT.PUT_LINE('Teste');
END;

/* Váriaveis */
DECLARE
    v1 NUMBER(2) := 10;
    v2 NUMBER(2) := 10;
    re NUMBER(3) := v1 + v2; -- Declarando e realizando operação
BEGIN
    dbms_output.put_line('RESULTADO: '||re);
END;


/* Entrada via teclado */
DECLARE
    -- Declaração de vm
    -- Uso de váriaveis de substituição
    v1 NUMBER(2) := &Valor_1;
    v2 NUMBER(2) := &Valor_2;
    re NUMBER(3) := v1 + v2;
BEGIN
    dbms_output.put_line('RESULTADO: '||re);
END;



-- Exercício 01
DECLARE
    v_salario_minimo NUMBER(4) := &Salario_minimo;
    v_resultado NUMBER(4) := v_salario_minimo + (v_salario_minimo * 0.25);
BEGIN
    dbms_output.put_line('RESULTADO: '||v_resultado);
END;


-- Exercício 02
DECLARE
    v_dolar NUMBER(4) := &Dolar;
    v_resultado NUMBER(4) := 45 * v_dolar;
BEGIN
    dbms_output.put_line('RESULTADO: '||v_resultado);
END;

-- Exercício 03
DECLARE
    v_reais NUMBER(4) := &Reais;
    v_dolar NUMBER(4) := &Dolar;
    v_resultado NUMBER(4) := v_reais * v_dolar;
BEGIN
    dbms_output.put_line('RESULTADO: '||v_resultado);
END;

-- Exercício 04
DECLARE
    v_valor_automovel NUMBER(4) := &Valor_automovel;
    v_juros NUMBER(4) := v_valor_automovel + (v_valor_automovel * 0.03);
    v_dez_vezes NUMBER(4) := v_juros / 10;
BEGIN
    dbms_output.put_line('JUROS: '||v_juros);
    dbms_output.put_line('EM 10x: '||v_dez_vezes);
END;


-- Exercício 05
DECLARE
    v_valor_automovel NUMBER(6) := &Valor_automovel;
    v_valor_entrada NUMBER(6) := v_valor_automovel * 0.20 ;
    v_valor_restante NUMBER(6) := v_valor_automovel - v_valor_entrada;
    
    v_doze_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.12)) / 12;
    v_seis_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.15)) / 6;
    v_dezoito_vezes NUMBER(6) := (v_valor_restante + (v_valor_restante * 0.18)) / 18;
BEGIN
    dbms_output.put_line('EM 6x: '||v_seis_vezes);
    dbms_output.put_line('EM 12x: '||v_doze_vezes);
    dbms_output.put_line('EM 18x: '||v_dezoito_vezes);
END;
