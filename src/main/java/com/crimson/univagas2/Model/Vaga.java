package com.crimson.univagas2.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Vaga  implements Serializable {
    private static final int serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String descricao;
    private String cidade;
    private String estado;
    private String pais;
    private Double salario;

    @OneToMany
    private List<Aplicante> aplicantes;

    @ManyToOne
    private Empresa empresa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<Aplicante> getAplicantes() {
        return aplicantes;
    }

    public void setAplicantes(List<Aplicante> aplicantes) {
        this.aplicantes = aplicantes;
    }
}

