package exercicios;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Segundo numero: ");
        int num2 = scanner.nextInt();

        Ordenador ordenador = new Ordenador(num1, num2);

        ordenador.ordenar();
    }
}

class Ordenador
{
    private int num1;
    private  int num2;

    public Ordenador(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void ordenar()
    {
        if (num1 < num2)
        {
            System.out.println("Crescente: " + num1 + ", " + num2);
        } else
        {
            System.out.println("Crescente: " + num2 + ", " + num1);
        }
    }
}
