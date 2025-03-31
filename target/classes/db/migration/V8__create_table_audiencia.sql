DO
$$
BEGIN
    CREATE TABLE IF NOT EXISTS correspondente.audiencia (
        id SERIAL PRIMARY KEY,
        numero_processo VARCHAR(50) NOT NULL,
        data TIMESTAMP NOT NULL,
        honorarios NUMERIC(12, 2),
        observacao VARCHAR(1000),

        advogado_id INTEGER NOT NULL,
        prioridade_id INTEGER NOT NULL,
        tipo_servico_id INTEGER NOT NULL,
        atividade_id INTEGER NOT NULL,
        local_id INTEGER NOT NULL,
        status_id INTEGER NOT NULL,

        data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        ativo BOOLEAN DEFAULT TRUE,

        CONSTRAINT fk_aud_adv FOREIGN KEY (advogado_id)
            REFERENCES correspondente.advogado(id),

        CONSTRAINT fk_aud_prioridade FOREIGN KEY (prioridade_id)
            REFERENCES correspondente.prioridade(id),

        CONSTRAINT fk_aud_tipo_servico FOREIGN KEY (tipo_servico_id)
            REFERENCES correspondente.tipo_servico(id),

        CONSTRAINT fk_aud_atividade FOREIGN KEY (atividade_id)
            REFERENCES correspondente.atividade(id),

        CONSTRAINT fk_aud_local FOREIGN KEY (local_id)
            REFERENCES correspondente.local(id),

        CONSTRAINT fk_aud_status FOREIGN KEY (status_id)
            REFERENCES correspondente.status(id)
    );
END
$$
LANGUAGE plpgsql;
