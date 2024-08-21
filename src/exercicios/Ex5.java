package exercicios;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Carros vendidos: ");
        int numTotalCarros = scanner.nextInt();

        System.out.print("Valor total das vendas: ");
        float valorTotal = scanner.nextFloat();

        System.out.print("Salario fixo: ");
        float salarioBase = scanner.nextFloat();

        System.out.print("Valor fixo por carro: ");
        float fixoPorCarro = scanner.nextFloat();

        FuncionarioCarro funcionarioCarro = new FuncionarioCarro(numTotalCarros, valorTotal, salarioBase, fixoPorCarro);

        System.out.println("Salario final: " + funcionarioCarro.salarioTotal());

        scanner.close();

    }
}

class FuncionarioCarro {
    private int carrosVendidos;
    private float valorTotalVendas;
    private float salariobase;
    private float valorPorCarro;

    public FuncionarioCarro(int carrosVendidos, float valorTotalVendas, float salariobase, float valorPorCarro) {
        this.carrosVendidos = carrosVendidos;
        this.valorTotalVendas = valorTotalVendas;
        this.salariobase = salariobase;
        this.valorPorCarro = valorPorCarro;
    }

    public float salarioTotal()
    {
        float total = salariobase + (carrosVendidos * valorPorCarro) + (valorTotalVendas * 0.05f);
        return total;
    }
}
