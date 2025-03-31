DO
$$
BEGIN
    CREATE TABLE IF NOT EXISTS correspondente.advogado (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(100) NOT NULL UNIQUE,
        data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        ativo BOOLEAN DEFAULT TRUE
    );

    -- Inserção dos advogados padrão

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.advogado WHERE nome = 'Ricardo Oliveira'
    ) THEN
        INSERT INTO correspondente.advogado (nome) VALUES ('Ricardo Oliveira');
    END IF;

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.advogado WHERE nome = 'Henrique Rocha'
    ) THEN
        INSERT INTO correspondente.advogado (nome) VALUES ('Henrique Rocha');
    END IF;

END
$$
LANGUAGE plpgsql;
