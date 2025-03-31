DO
$$
BEGIN
    -- Criação da tabela
    CREATE TABLE IF NOT EXISTS correspondente.prioridade (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(50) NOT NULL UNIQUE,
        descricao VARCHAR(100),
        data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        ativo BOOLEAN DEFAULT TRUE
    );

    -- Inserção dos registros padrão, apenas se ainda não existirem
    IF NOT EXISTS (
        SELECT 1 FROM correspondente.prioridade WHERE nome = 'URGENTE'
    ) THEN
        INSERT INTO correspondente.prioridade (nome, descricao)
        VALUES ('URGENTE', 'Audiência que exige atenção imediata');
    END IF;

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.prioridade WHERE nome = 'NORMAL'
    ) THEN
        INSERT INTO correspondente.prioridade (nome, descricao)
        VALUES ('NORMAL', 'Audiência comum sem prioridade elevada');
    END IF;
END
$$
LANGUAGE plpgsql;
