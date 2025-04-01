package br.com.correspondente.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Advogado;
import br.com.correspondente.entity.dto.ContentDTO;
import br.com.correspondente.service.AdvogadoService;
import br.com.correspondente.utils.ResponseUtils;

@RestController
@RequestMapping(value = "/advogados", produces = "application/json")
public class AdvogadoController {
    private final AdvogadoService service;

    public AdvogadoController(AdvogadoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ContentDTO<List<Advogado>>> listar() {
        try {
            return ResponseUtils.sucesso(service.listarTodos());
        } catch (Exception e) {
            return ResponseUtils.falha(e);
        }
    }

    @PostMapping
    public ResponseEntity<ContentDTO<Advogado>> salvar(@RequestBody Advogado advogado) {
        try {
            return ResponseUtils.sucesso(service.salvar(advogado));
        } catch (Exception e) {
            return ResponseUtils.falha(e);
        }
    }
}
