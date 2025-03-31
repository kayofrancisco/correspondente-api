package br.com.correspondente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Atividade;
import br.com.correspondente.service.AtividadeService;

@RestController
@RequestMapping(value = "/atividades", produces = "application/json")
public class AtividadeController {
    private final AtividadeService service;

    public AtividadeController(AtividadeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Atividade> listar() {
        List<Atividade> adv = service.listarTodos();

        return adv;
    }
}
