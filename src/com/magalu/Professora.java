package com.magalu;

import java.util.ArrayList;

public class Professora {
    private String nome;
    private String curso;
    private String cpf;
    private double salario;
    private final float VALOR_HORA_AULA = 29f;
    private ArrayList <Aluna> alunas = new ArrayList<Aluna>();

    public Professora() {
    }

    public Professora(String nome, String curso, String cpf) {
        this.nome = nome;
        this.curso = curso;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }


    public ArrayList<Aluna> getAlunas() {
        return alunas;
    }

    public void setAlunas(ArrayList<Aluna> alunas) {
        this.alunas = alunas;
    }

    public void setSalarioProfessora(int nAulasMininstradas){
        this.salario = this.VALOR_HORA_AULA * nAulasMininstradas;
    }

    public void incluirAluna(Aluna aluna){
        alunas.add(aluna);
    }

}
