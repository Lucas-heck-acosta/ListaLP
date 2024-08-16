package exercicios;

import java.util.Scanner;

public class Eleicao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("número total de votos: ");
        int totalEleitores = scanner.nextInt();
        System.out.print("número de votos brancos: ");
        int votosBrancos = scanner.nextInt();
        System.out.print("número de votos nulos: ");
        int votosNulos = scanner.nextInt();
        System.out.print("número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        Votacao votacao = new Votacao(totalEleitores, votosBrancos, votosNulos, votosValidos);
        System.out.println("Percentual de brancos: " + votacao.calcularPercentualBrancos() + "%");
        System.out.println("Percentual de nulos: " + votacao.calcularPercentualNulos() + "%");
        System.out.println("Percentual de válidos: " + votacao.calcularPercentualValidos() + "%");
        System.out.println("TOTAL: 100% (eu espero)");

        scanner.close();
    }
}

class Votacao {
    private int totalEleitores;
    private int votosBrancos;
    private int votosNulos;
    private int votosValidos;

    public Votacao(int totalEleitores, int votosBrancos, int votosNulos, int votosValidos) {
        this.totalEleitores = totalEleitores;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
        this.votosValidos = votosValidos;
    }

    public double calcularPercentualBrancos() {
        return (double) votosBrancos / totalEleitores * 100;
    }

    public double calcularPercentualNulos() {
        return (double) votosNulos / totalEleitores * 100;
    }

    public double calcularPercentualValidos() {
        return (double) votosValidos / totalEleitores * 100;
    }
}
