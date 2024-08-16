package exercicios;

import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota prova 1: ");
        float np1 = scanner.nextFloat();

        System.out.print("Nota prova 2: ");
        float np2 = scanner.nextFloat();

        Aluno aluno = new Aluno(np1, np2);

        System.out.println("Media final: " + aluno.calcularMedia());
        if (aluno.calcularMedia() >= 6) System.out.println("APROVADO");
        else System.out.println("REPROVADO");


    }
}

class Aluno {
    float np1;
    float np2;
    float media;

    public Aluno(float np1, float np2)
    {
        this.np1 = np1;
        this.np2 = np2;
    }

    public float calcularMedia()
    {
        this.media = (np1 + np2) / 2;
        return media;
    }
}
