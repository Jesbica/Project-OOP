package br.com.concessionaria.service;

import br.com.concessionaria.model.StatusVeiculo;
import br.com.concessionaria.model.Veiculo;
import br.com.concessionaria.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> buscarPorId(Long id) {
        return veiculoRepository.findById(id);
    }

    public void deletar(Long id) {
        veiculoRepository.deleteById(id);
    }

    public List<Veiculo> buscarPorModelo(String modelo) {
        return veiculoRepository.findByModelo(modelo);
    }

    public List<Veiculo> buscarPorAno(Integer ano) {
        return veiculoRepository.findByAno(ano);
    }

    public List<Veiculo> buscarPorStatus(StatusVeiculo status) {
        return veiculoRepository.findByStatus(status);
    }

    public List<Veiculo> buscarPorPreco(Double preco) {
        return veiculoRepository.findByPrecoLessThanEqual(preco);
    }
}
