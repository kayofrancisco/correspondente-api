DO
$$
BEGIN
    CREATE TABLE IF NOT EXISTS correspondente.status (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(50) NOT NULL UNIQUE,
        descricao VARCHAR(100),
        data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        ativo BOOLEAN DEFAULT TRUE
    );

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.status WHERE nome = 'Realizada'
    ) THEN
        INSERT INTO correspondente.status (nome, descricao)
        VALUES ('Realizada', 'Audiência concluída normalmente');
    END IF;

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.status WHERE nome = 'Não Realizada'
    ) THEN
        INSERT INTO correspondente.status (nome, descricao)
        VALUES ('Não Realizada', 'Audiência que não ocorreu');
    END IF;

    IF NOT EXISTS (
        SELECT 1 FROM correspondente.status WHERE nome = 'Redesignada'
    ) THEN
        INSERT INTO correspondente.status (nome, descricao)
        VALUES ('Redesignada', 'Audiência remarcada para nova data');
    END IF;

END
$$
LANGUAGE plpgsql;
