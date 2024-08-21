package exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        AnalisadorDeNumeros analisador = new AnalisadorDeNumeros();

        System.out.print("O numero " + numero + " é " + ((analisador.verificarSeMaiorQueDez(numero) ? "MAIOR" : "MENOR") + " que 10!"));

        scanner.close();
    }
}

class AnalisadorDeNumeros {
    public boolean verificarSeMaiorQueDez(int numero)
    {
        return numero > 10;
    }
}
