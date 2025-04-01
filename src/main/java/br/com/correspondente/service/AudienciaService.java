package br.com.correspondente.service;

import java.util.List;

import br.com.correspondente.entity.Audiencia;
import br.com.correspondente.exceptions.NegocioException;

public interface AudienciaService {
    List<Audiencia> listarTodas();

    Audiencia salvar(Audiencia audiencia) throws NegocioException;
}
