package exercicios;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Segundo numero: ");
        int num2 = scanner.nextInt();

        ComparadorDeNumeros comparadorDeNumeros = new ComparadorDeNumeros(num1, num2);

        comparadorDeNumeros.comparar();
    }
}

class ComparadorDeNumeros
{
    private int num1;
    private  int num2;

    public ComparadorDeNumeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void comparar()
    {
        int maior = num1 > num2 ? num1 : num2;
        System.out.println("Numero " + maior + " é o maior");
    }
}
