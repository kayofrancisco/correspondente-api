package br.com.correspondente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Prioridade;
import br.com.correspondente.service.PrioridadeService;

@RestController
@RequestMapping(value = "/prioridades", produces = "application/json")
public class PrioridadeController {
    private final PrioridadeService service;

    public PrioridadeController(PrioridadeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Prioridade> listar() {
        List<Prioridade> adv = service.listarTodos();

        return adv;
    }
}
