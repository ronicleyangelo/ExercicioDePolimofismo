package com.roniceyangelo.demo.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "produtos")
public class Produto {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @JsonProperty("produto_id")
    @Column(name = "id")
    private Long produtoId;

    @Column(name = "nome_loja")
    @JsonProperty("nome_loja")
    private String nomeLoja;
    @Column(name = "preco")
    private float preco;
    @Column(name = "descricao")
    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
