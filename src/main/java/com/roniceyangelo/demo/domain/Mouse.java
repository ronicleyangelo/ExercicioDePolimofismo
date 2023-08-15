package com.roniceyangelo.demo.domain;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.List;

import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
//@Table(name = "Mouse")
public class Mouse extends Produto{
    private String tipo;

    public Mouse(String descricao, String tipo) {
        super(descricao);
        this.tipo = tipo;
    }

    @Override
    public String getDescricao() {
        return String.format("%s %s %s", super.getDescricao()," Tipo:", getTipo());
    }

}
