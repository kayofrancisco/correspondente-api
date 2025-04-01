package br.com.correspondente.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Local;
import br.com.correspondente.entity.dto.ContentDTO;
import br.com.correspondente.service.LocalService;
import br.com.correspondente.utils.ResponseUtils;

@RestController
@RequestMapping(value = "/locais", produces = "application/json")
public class LocalController {
    private final LocalService service;

    public LocalController(LocalService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ContentDTO<List<Local>>> listar() {
        try {
            return ResponseUtils.sucesso(service.listarTodos());
        } catch (Exception e) {
            return ResponseUtils.falha(e);
        }
    }
}
