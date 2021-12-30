package com.crimson.univagas2.Model;

import javax.persistence.*;

import com.crimson.univagas2.Model.Vaga;

import java.io.Serializable;

@Entity
public class Aplicante implements Serializable {
    private static final int serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_aplicante;
    private String nome;
    private String contato;
    private String curriculo;

    @ManyToOne
    private Vaga vaga;

    public Long getId_aplicante() {
        return id_aplicante;
    }

    public void setId_aplicante(Long id_aplicante) {
        this.id_aplicante = id_aplicante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(String curriculo) {
        this.curriculo = curriculo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }
}
