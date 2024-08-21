package exercicios;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas macas comprar? ");
        int numMacas = scanner.nextInt();

        Feirinha feirinha = new Feirinha();

        System.out.println("O total de " + numMacas + " é: " + feirinha.precoDasMacas(numMacas));

        scanner.close();
    }
}

class Feirinha {
    public float precoDasMacas(int total)
    {
        float preco;
        if (total >= 12) preco = 1;
        else preco = 1.3f;

        return preco * total;
    }
}
