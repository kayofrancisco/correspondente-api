package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Advogado;
import br.com.correspondente.respository.AdvogadoRepository;
import br.com.correspondente.service.AdvogadoService;

@Service("AdvogadoService")
public class AdvogadoServiceImpl implements AdvogadoService {
    private AdvogadoRepository repository;

    @Autowired
    protected void setRepository(AdvogadoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Advogado> listarAdvogados() {
        return repository.findAll();
    }

}
