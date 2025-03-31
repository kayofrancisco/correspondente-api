DO
$$
BEGIN
    CREATE TABLE IF NOT EXISTS correspondente.local (
        id SERIAL PRIMARY KEY,
        nome VARCHAR(100) NOT NULL UNIQUE,
        descricao TEXT,
        data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        ativo BOOLEAN DEFAULT TRUE
    );

    -- Inserção dos locais padrão

    INSERT INTO correspondente.local (nome) SELECT 'DPF - DF'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'DPF - DF');

    INSERT INTO correspondente.local (nome) SELECT 'PROCON/DF'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'PROCON/DF');

    INSERT INTO correspondente.local (nome) SELECT 'CDC/CLDF'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'CDC/CLDF');

    INSERT INTO correspondente.local (nome) SELECT 'Receita Federal'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'Receita Federal');

    INSERT INTO correspondente.local (nome) SELECT 'Detran - DF'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'Detran - DF');

    INSERT INTO correspondente.local (nome) SELECT 'Delegacia'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'Delegacia');

    INSERT INTO correspondente.local (nome) SELECT 'Tribunal de Justiça'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'Tribunal de Justiça');

    INSERT INTO correspondente.local (nome) SELECT '2VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '2VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '7VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '7VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '1VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '1VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '3VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '3VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '13VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '13VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '1JECBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '1JECBSB');

    INSERT INTO correspondente.local (nome) SELECT 'CAC/RF'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = 'CAC/RF');

    INSERT INTO correspondente.local (nome) SELECT '5VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '5VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '6VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '6VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '24VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '24VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '18VCBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '18VCBSB');

    INSERT INTO correspondente.local (nome) SELECT '7JECBSB'
        WHERE NOT EXISTS (SELECT 1 FROM correspondente.local WHERE nome = '7JECBSB');

END
$$
LANGUAGE plpgsql;
