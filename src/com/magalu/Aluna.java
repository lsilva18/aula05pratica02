package com.magalu;

public class Aluna {
    private String nome;
    private float nota1;
    private float nota2;
    private final double NOTA_LIMITE = 7.0;

    public Aluna(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float calcularMedia(float nota1, float nota2){
        return (this.nota1 + this.nota2) / 2;
    }

    public void informarStatus(float media) {
        if(media < NOTA_LIMITE){
            System.out.println("REPROVADA");
        }else {
            System.out.println("APROVADA");
        }
    }
}
