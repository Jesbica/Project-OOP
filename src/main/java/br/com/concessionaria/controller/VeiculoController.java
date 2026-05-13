package br.com.concessionaria.controller;

import br.com.concessionaria.model.StatusVeiculo;
import br.com.concessionaria.model.Veiculo;
import br.com.concessionaria.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Veiculo> buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {

        Veiculo veiculo = veiculoService.buscarPorId(id).orElseThrow();

        veiculo.setModelo(veiculoAtualizado.getModelo());
        veiculo.setAno(veiculoAtualizado.getAno());
        veiculo.setCor(veiculoAtualizado.getCor());
        veiculo.setPreco(veiculoAtualizado.getPreco());
        veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
        veiculo.setStatus(veiculoAtualizado.getStatus());
        veiculo.setMarca(veiculoAtualizado.getMarca());

        return veiculoService.salvar(veiculo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        veiculoService.deletar(id);
    }

    @GetMapping("/modelo/{modelo}")
    public List<Veiculo> buscarPorModelo(@PathVariable String modelo) {
        return veiculoService.buscarPorModelo(modelo);
    }

    @GetMapping("/ano/{ano}")
    public List<Veiculo> buscarPorAno(@PathVariable Integer ano) {
        return veiculoService.buscarPorAno(ano);
    }

    @GetMapping("/status/{status}")
    public List<Veiculo> buscarPorStatus(@PathVariable StatusVeiculo status) {
        return veiculoService.buscarPorStatus(status);
    }

    @GetMapping("/preco/{preco}")
    public List<Veiculo> buscarPorPreco(@PathVariable Double preco) {
        return veiculoService.buscarPorPreco(preco);
    }
}