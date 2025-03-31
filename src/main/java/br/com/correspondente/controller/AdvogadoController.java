package br.com.correspondente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.correspondente.entity.Advogado;
import br.com.correspondente.service.AdvogadoService;

@RestController
@RequestMapping(value = "/advogados", produces = "application/json")
public class AdvogadoController {
    private AdvogadoService service;

    @Autowired
    protected void setService(AdvogadoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Advogado> listar() {
    	List<Advogado> adv = service.listarAdvogados();
    	
    	return adv;
    }
}
