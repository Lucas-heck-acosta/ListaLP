package exercicios;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Ano atual: ");
        int anoAtual = scanner.nextInt();

        IdadeDeVotacao idadeDeVotacao = new IdadeDeVotacao(anoAtual, anoNascimento);
        if (idadeDeVotacao.podeVotar())
        {
            System.out.println("Ja pode votar!");
        } else
        {
            System.out.println("Ainda nao pode votar!");
        }

    }
}

class IdadeDeVotacao
{
    private int anoAtual;
    private  int anoNascimento;

    public IdadeDeVotacao(int anoAtual, int anoNascimento) {
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    public boolean podeVotar()
    {
        return (anoAtual - anoNascimento) >= 16;
    }
}
