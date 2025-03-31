DO
$$
BEGIN
    CREATE TABLE IF NOT EXISTS correspondente.atividade (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(100) NOT NULL UNIQUE,
        descricao VARCHAR(100),
        data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        ativo BOOLEAN DEFAULT TRUE
    );

    -- Inserção dos registros padrão

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'Audiência Administrativa') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('Audiência Administrativa');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'Audiência Judicial') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('Audiência Judicial');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'Cópia de Inquérito') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('Cópia de Inquérito');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'AC') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('AC');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'AIJ') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('AIJ');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'ACIJ') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('ACIJ');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'Julgamento') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('Julgamento');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'Desembaraço Aduaneiro') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('Desembaraço Aduaneiro');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'Protocolo') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('Protocolo');
    END IF;

    IF NOT EXISTS (SELECT 1 FROM correspondente.atividade WHERE nome = 'Emissão de guia de pagamentos') THEN
        INSERT INTO correspondente.atividade (nome) VALUES ('Emissão de guia de pagamentos');
    END IF;

END
$$
LANGUAGE plpgsql;
