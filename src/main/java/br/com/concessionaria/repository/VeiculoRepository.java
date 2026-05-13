package br.com.concessionaria.repository;

import br.com.concessionaria.model.StatusVeiculo;
import br.com.concessionaria.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByModelo(String modelo);

    List<Veiculo> findByAno(Integer ano);

    List<Veiculo> findByStatus(StatusVeiculo status);

    List<Veiculo> findByPrecoLessThanEqual(Double preco);
}
