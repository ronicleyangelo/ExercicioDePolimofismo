package com.roniceyangelo.demo.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name = "livro")
public class Livro extends Produto{
    private String autor;

    public Livro(String descricao, String autor) {
        super(descricao);
        this.autor = autor;
    }

    @Override
    public String getDescricao() {
        return String.format("%s %s %s", super.getDescricao()," Author:", getAutor());
    }
}
