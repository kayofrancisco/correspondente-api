package br.com.correspondente.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Audiencia;
import br.com.correspondente.service.AudienciaService;

@RestController
@RequestMapping(value = "/audiencias", produces = "application/json")
public class AudienciaController {
    private final AudienciaService service;

    public AudienciaController(AudienciaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Audiencia> listar() {
        List<Audiencia> adv = service.listarTodas();

        return adv;
    }

    @PostMapping
    public Audiencia salvar(@RequestBody Audiencia audiencia) {
        return service.salvar(audiencia);
    }
}
