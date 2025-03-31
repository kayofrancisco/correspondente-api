DO
$$
BEGIN
    -- Criação da tabela tipo_servico
    CREATE TABLE IF NOT EXISTS correspondente.tipo_servico (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(50) NOT NULL UNIQUE,
        descricao VARCHAR(100),
        data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        ativo BOOLEAN DEFAULT TRUE
    );

    -- Inserção dos valores padrão

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.tipo_servico WHERE nome = 'Audiência'
    ) THEN
        INSERT INTO correspondente.tipo_servico (nome, descricao)
        VALUES ('Audiência', 'Atuação em audiência presencial ou virtual');
    END IF;

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.tipo_servico WHERE nome = 'Diligência'
    ) THEN
        INSERT INTO correspondente.tipo_servico (nome, descricao)
        VALUES ('Diligência', 'Cumprimento de tarefa fora da audiência, como entrega ou protocolo de documentos');
    END IF;

END
$$
LANGUAGE plpgsql;
