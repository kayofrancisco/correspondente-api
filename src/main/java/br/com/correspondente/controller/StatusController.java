package br.com.correspondente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Status;
import br.com.correspondente.service.StatusService;

@RestController
@RequestMapping(value = "/status", produces = "application/json")
public class StatusController {
    private final StatusService service;

    public StatusController(StatusService service) {
        this.service = service;
    }

    @GetMapping
    public List<Status> listar() {
        List<Status> adv = service.listarTodos();

        return adv;
    }
}
