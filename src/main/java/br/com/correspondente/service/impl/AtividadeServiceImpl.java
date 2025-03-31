package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Atividade;
import br.com.correspondente.respository.AtividadeRepository;
import br.com.correspondente.service.AtividadeService;

@Service("AtividadeService")
public class AtividadeServiceImpl implements AtividadeService {
    private final AtividadeRepository repository;

    public AtividadeServiceImpl(AtividadeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Atividade> listarTodos() {
        return repository.findAll();
    }

}
