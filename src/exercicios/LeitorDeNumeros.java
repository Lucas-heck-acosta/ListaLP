package exercicios;

import java.util.Scanner;

public class LeitorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        Analisador analisador = new Analisador();

        System.out.print("O numero " + numero + " é " + ((analisador.verificarSeMaiorQueDez(numero) ? "MAIOR" : "MENOR") + " que 10!"));

        scanner.close();
    }
}

class Analisador {
    public boolean verificarSeMaiorQueDez(int numero)
    {
        return numero > 10;
    }
}
