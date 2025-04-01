package br.com.correspondente.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Atividade;
import br.com.correspondente.entity.dto.ContentDTO;
import br.com.correspondente.service.AtividadeService;
import br.com.correspondente.utils.ResponseUtils;

@RestController
@RequestMapping(value = "/atividades", produces = "application/json")
public class AtividadeController {
    private final AtividadeService service;

    public AtividadeController(AtividadeService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ContentDTO<List<Atividade>>> listar() {
        try {
            return ResponseUtils.sucesso(service.listarTodos());
        } catch (Exception e) {
            return ResponseUtils.falha(e);
        }
    }
}
