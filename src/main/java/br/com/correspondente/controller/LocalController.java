package br.com.correspondente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Local;
import br.com.correspondente.service.LocalService;

@RestController
@RequestMapping(value = "/locais", produces = "application/json")
public class LocalController {
    private final LocalService service;

    public LocalController(LocalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Local> listar() {
        List<Local> adv = service.listarTodos();

        return adv;
    }
}
