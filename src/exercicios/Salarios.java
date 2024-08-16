package exercicios;

import java.util.Scanner;

public class Salarios {
    public  static  void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salario atual: ");
        float salario = scanner.nextFloat();
        System.out.println("Percentual de aumento: ");
        float aumento = scanner.nextFloat();

        Funcinario funcinario = new Funcinario(salario);


        System.out.println("Novo salario com aumento: " + funcinario.aumentarSalario(10));
    }
}


class Funcinario {
    float salario;

    public  Funcinario(float salario)
    {
        this.salario = salario;
    }
    public float aumentarSalario(float porcentagem)
    {
        this.salario = (this.salario / 100) * (100 + porcentagem);
        return salario;
    }
}
