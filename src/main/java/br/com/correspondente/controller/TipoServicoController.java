package br.com.correspondente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.TipoServico;
import br.com.correspondente.service.TipoServicoService;

@RestController
@RequestMapping(value = "/tipos-servico", produces = "application/json")
public class TipoServicoController {
    private final TipoServicoService service;

    public TipoServicoController(TipoServicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<TipoServico> listar() {
        List<TipoServico> adv = service.listarTodos();

        return adv;
    }
}
