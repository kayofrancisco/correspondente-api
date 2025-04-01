package br.com.correspondente.service;

import java.util.List;

import br.com.correspondente.entity.Advogado;
import br.com.correspondente.exceptions.NegocioException;

public interface AdvogadoService {
    public List<Advogado> listarTodos();

    public Advogado salvar(Advogado adv) throws NegocioException;
}
