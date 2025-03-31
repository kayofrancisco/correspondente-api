package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.TipoServico;
import br.com.correspondente.respository.TipoServicoRepository;
import br.com.correspondente.service.TipoServicoService;

@Service("TipoServicoService")
public class TipoServicoServiceImpl implements TipoServicoService {
    private final TipoServicoRepository repository;

    public TipoServicoServiceImpl(TipoServicoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<TipoServico> listarTodos() {
        return repository.findAll();
    }

}
