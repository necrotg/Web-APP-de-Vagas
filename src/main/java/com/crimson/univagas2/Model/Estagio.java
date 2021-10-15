package com.crimson.univagas2.Model;

import javax.persistence.Entity;

@Entity
public class Estagio extends Vaga{

    private String semestre;
    private String curso;

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
