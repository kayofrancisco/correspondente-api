package br.com.correspondente.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.correspondente.entity.Advogado;
import br.com.correspondente.exceptions.NegocioException;
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

    @Override
    public Advogado salvar(Advogado adv) throws NegocioException {
        if (adv.getNome() == null) {
            throw new NegocioException("Nome do advogado é obrigatório");
        }

        List<Advogado> advogadosPorNome = this.repository.findByNome(adv.getNome());

        if (!advogadosPorNome.isEmpty()) {
            throw new NegocioException("Advogado já está cadastrado");
        }

        return repository.save(adv);
    }

}
