package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Local;
import br.com.correspondente.respository.LocalRepository;
import br.com.correspondente.service.LocalService;

@Service("LocalService")
public class LocalServiceImpl implements LocalService {
    private final LocalRepository repository;

    public LocalServiceImpl(LocalRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Local> listarTodos() {
        return repository.findAll();
    }

}
