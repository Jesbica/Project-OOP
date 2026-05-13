package br.com.concessionaria.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private Integer ano;
    private String cor;
    private Double preco;
    private Double quilometragem;

    @Enumerated(EnumType.STRING)
    private StatusVeiculo status;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;
}
