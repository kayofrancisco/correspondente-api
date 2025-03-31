package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Status;
import br.com.correspondente.respository.StatusRepository;
import br.com.correspondente.service.StatusService;

@Service("StatusService")
public class StatusServiceImpl implements StatusService {
    private final StatusRepository repository;

    public StatusServiceImpl(StatusRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Status> listarTodos() {
        return repository.findAll();
    }

}
