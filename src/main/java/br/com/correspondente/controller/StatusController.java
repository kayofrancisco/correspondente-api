package br.com.correspondente.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Status;
import br.com.correspondente.entity.dto.ContentDTO;
import br.com.correspondente.service.StatusService;
import br.com.correspondente.utils.ResponseUtils;

@RestController
@RequestMapping(value = "/status", produces = "application/json")
public class StatusController {
    private final StatusService service;

    public StatusController(StatusService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ContentDTO<List<Status>>> listar() {
        try {
            return ResponseUtils.sucesso(service.listarTodos());
        } catch (Exception e) {
            return ResponseUtils.falha(e);
        }
    }
}
