package com.roniceyangelo.demo.domain;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Teclado extends Produto{
    private String marca;

    public Teclado(String descricao, String marca) {
        super(descricao);
        this.marca = marca;
    }
    @Override
    public String getDescricao() {
        return String.format("%s %s %s",super.getDescricao(), " Marca:", marca);
    }

}
