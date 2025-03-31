package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Prioridade;
import br.com.correspondente.respository.PrioridadeRepository;
import br.com.correspondente.service.PrioridadeService;

@Service("PrioridadeService")
public class PrioridadeServiceImpl implements PrioridadeService {
    private final PrioridadeRepository repository;

    public PrioridadeServiceImpl(PrioridadeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Prioridade> listarTodos() {
        return repository.findAll();
    }
}