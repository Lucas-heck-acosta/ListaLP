package exercicios;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora de inicio: ");
        int horaInicio = scanner.nextInt();

        System.out.print("Hora do fim de jogo: ");
        int horaFinal = scanner.nextInt();

        PartidaXadrez partidaXadrez = new PartidaXadrez(horaInicio, horaFinal);
        System.out.println("A partida durou: " + partidaXadrez.duracaoDaPartida() + " horas!");

        scanner.close();
    }
}

class PartidaXadrez
{
    private int horarioInicio;
    private int horarioFinal;

    public PartidaXadrez(int horarioInicio, int horarioFinal) {
        this.horarioInicio = horarioInicio;
        this.horarioFinal = horarioFinal;
    }

    public int duracaoDaPartida()
    {
        int duracao;

        if (horarioFinal > horarioInicio)
        {
            duracao = horarioFinal - horarioInicio;
        } else
        {
            duracao = (24 - horarioInicio) + horarioFinal;
        }
        return duracao;
    }
}

