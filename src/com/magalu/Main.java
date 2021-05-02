package com.magalu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Professora professora = new Professora("Livia", "eletrônica industrial", "111.111.111-11");
        Aluna aluna = new Aluna("Aluna1");
        int nAulasMininstradas;
        float media;

        //informacoes da professora
        System.out.println("Docente: " + professora.getNome() );
        System.out.println("Disciplina: " + professora.getCurso() );


        //setando salario da professoa
        System.out.println("Digite o número de aulas ministradas:");
        nAulasMininstradas = input.nextInt();
        professora.setSalarioProfessora(nAulasMininstradas);
        System.out.println("O salário da professora é: " + professora.getSalario());


        // associando aluna a professora
        System.out.println("Digite o nome da aulna que deseja incluir:");
        aluna.setNome(input.next());
        System.out.println("Digite a primeira nota da aluna que deseja incluir:");
        aluna.setNota1(input.nextFloat());
        System.out.println("Digite a segunda nota da aluna que deseja incluir:");
        aluna.setNota2(input.nextFloat());
        professora.incluirAluna(aluna);


        // impressao de resultado
        for( Aluna a : professora.getAlunas()) {
           media  = a.calcularMedia(a.getNota1(), a.getNota2());
           System.out.printf("Aluna " + a.getNome() + ": " );
           a.informarStatus( media );
        }

    }
}
