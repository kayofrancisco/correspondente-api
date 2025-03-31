package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Audiencia;
import br.com.correspondente.respository.AudienciaRepository;
import br.com.correspondente.service.AudienciaService;

@Service("AudienciaService")
public class AudienciaServiceImpl implements AudienciaService {
    private final AudienciaRepository repository;

    public AudienciaServiceImpl(AudienciaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Audiencia> listarTodas() {
        return repository.findAll();
    }

    @Override
    public Audiencia salvar(Audiencia audiencia) {
        return repository.save(audiencia);
    }
}
