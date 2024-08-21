package exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Custo de fabrica: ");
        float custo = scanner.nextFloat();
        float distribuidor = 0.28f;
        float impostos = 0.45f;

        Carro carro = new Carro(custo);

        float precoTotal = carro.calcularPreco(distribuidor, impostos);
        System.out.println("preco final: " + precoTotal);

        scanner.close();
    }
}

class Carro {
    private float custo;

    public  Carro(float custo)
    {
        this.custo = custo;
    }

    public float calcularPreco(float taxaDistribuidor, float taxaImposto)
    {
        return this.custo + (this.custo * taxaDistribuidor) + (this.custo * taxaImposto);
    }
}
