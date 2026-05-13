package br.com.concessionaria.controller;

import br.com.concessionaria.model.Marca;
import br.com.concessionaria.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @PostMapping
    public Marca salvar(@RequestBody Marca marca) {
        return marcaService.salvar(marca);
    }

    @GetMapping
    public List<Marca> listar() {
        return marcaService.listar();
    }
}
