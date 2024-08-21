package exercicios;

import java.util.Scanner;

public class Ex3 {
    public  static  void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salario atual: ");
        float salario = scanner.nextFloat();
        System.out.print("Percentual de aumento: ");
        float aumento = scanner.nextFloat();

        FuncionarioSalario funcinario = new FuncionarioSalario(salario);


        System.out.println("Novo salario com aumento: " + funcinario.aumentarSalario(aumento));
    }
}


class FuncionarioSalario {
    private float salario;

    public  FuncionarioSalario(float salario)
    {
        this.salario = salario;
    }
    public float aumentarSalario(float porcentagem)
    {
        this.salario = (this.salario / 100) * (100 + porcentagem);
        return salario;
    }
}
