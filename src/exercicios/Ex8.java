package exercicios;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        Comparador comparador = new Comparador();
        System.out.print("O numero " + numero + " é " + ((comparador.verificarSePositivo(numero) ? "POSITIVO" : "NEGATIVO")));

        scanner.close();

    }
}

class  Comparador {
    public boolean verificarSePositivo(int numero)
    {
        return numero >= 0;
    }
}