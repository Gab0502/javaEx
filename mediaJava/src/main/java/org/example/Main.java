package org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Estudante aluno = new Estudante();

        aluno.lerNotasDoEstudante();
        aluno.calcularMediaPrimeiroSemestre();
        System.out.println("media semestre 1 =" + aluno.mediaSemestreUm);
        System.out.println("media semestre 2 =" + aluno.mediaSemestreDois);
        System.out.println("media anual =" + aluno.mediaAnual);





    }
}