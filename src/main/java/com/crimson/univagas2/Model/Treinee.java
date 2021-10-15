package com.crimson.univagas2.Model;

import javax.persistence.Entity;

@Entity
public class Treinee extends Estagio{
    private String conclusao;

    public String getConclusao() {
        return conclusao;
    }

    public void setConclusao(String conclusao) {
        this.conclusao = conclusao;
    }
}
