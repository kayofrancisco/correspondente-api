package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Advogado;
import br.com.correspondente.respository.AdvogadoRepository;
import br.com.correspondente.service.AdvogadoService;

@Service("AdvogadoService")
public class AdvogadoServiceImpl implements AdvogadoService {
    private final AdvogadoRepository repository;

    public AdvogadoServiceImpl(AdvogadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Advogado> listarTodos() {
        return repository.findAll();
    }

}
