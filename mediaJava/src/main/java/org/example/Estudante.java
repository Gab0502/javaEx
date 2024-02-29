package org.example;

import java.util.Scanner;

public class Estudante {
    //Declarar atributos do estudante
    float checkpointSemestreUm;
    float checkpointSemestreDois;
    float globalSolutionSemestreUm;
    float globalSolutionSemestreDois;

    float mediaSemestreUm;
    float mediaSemestreDois;
    float mediaAnual;

    public Estudante() {    
        this.checkpointSemestreUm = 0.0f;
        this.checkpointSemestreDois = 0.0f;
        this.globalSolutionSemestreUm = 0.0f;
        this.globalSolutionSemestreDois = 0.0f;
    }

    public Estudante(float checkpointSemestreUm, float globalSolutionSemestreUm, float checkpointSemestreDois, float globalSolutionSemestreDois) {
        this.checkpointSemestreUm = checkpointSemestreUm;
        this.checkpointSemestreDois = checkpointSemestreDois;
        this.globalSolutionSemestreUm = globalSolutionSemestreUm;
        this.globalSolutionSemestreDois = globalSolutionSemestreDois;
    }


    void lerNotasDoEstudante(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira as notas do primeiro semestre");
        System.out.print("Checkpoint: ");
        this.checkpointSemestreUm = input.nextFloat();

        System.out.print("\nGlobal Solutions: ");
        this.globalSolutionSemestreUm = input.nextFloat();

        System.out.println("Insira as notas do segundo semestre");
        System.out.print("Checkpoint: ");
        this.checkpointSemestreDois = input.nextFloat();

        System.out.print("\nGlobal Solutions: ");
        this.globalSolutionSemestreDois = input.nextFloat();
    }

    void calcularMediaPrimeiroSemestre(){

        mediaSemestreUm = (float) ((checkpointSemestreUm * 0.4) + (globalSolutionSemestreUm * 0.6));
        mediaSemestreDois = (float) ((checkpointSemestreDois *0.4) + (globalSolutionSemestreDois * 0.6));
        mediaAnual = (float) ((mediaSemestreUm*0.4)+(mediaSemestreDois*0.6));
    }
}
