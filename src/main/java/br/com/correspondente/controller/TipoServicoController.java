package br.com.correspondente.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.TipoServico;
import br.com.correspondente.entity.dto.ContentDTO;
import br.com.correspondente.service.TipoServicoService;
import br.com.correspondente.utils.ResponseUtils;

@RestController
@RequestMapping(value = "/tipos-servico", produces = "application/json")
public class TipoServicoController {
    private final TipoServicoService service;

    public TipoServicoController(TipoServicoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<ContentDTO<List<TipoServico>>> listar() {
        try {
            return ResponseUtils.sucesso(service.listarTodos());
        } catch (Exception e) {
            return ResponseUtils.falha(e);
        }
    }
}
