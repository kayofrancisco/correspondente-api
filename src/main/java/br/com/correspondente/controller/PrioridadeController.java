package br.com.correspondente.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Prioridade;
import br.com.correspondente.entity.dto.ContentDTO;
import br.com.correspondente.service.PrioridadeService;
import br.com.correspondente.utils.ResponseUtils;

@RestController
@RequestMapping(value = "/prioridades", produces = "application/json")
public class PrioridadeController {
    private final PrioridadeService service;

    public PrioridadeController(PrioridadeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ContentDTO<List<Prioridade>>> listar() {
        try {
            return ResponseUtils.sucesso(service.listarTodos());
        } catch (Exception e) {
            return ResponseUtils.falha(e);
        }
    }
}
