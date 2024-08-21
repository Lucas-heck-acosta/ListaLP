package exercicios;

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        int totalHoras = scanner.nextInt();

        System.out.print("Salario por hora: ");
        float salarioPorHora = scanner.nextFloat();

        Funcionario funcionario = new Funcionario(totalHoras, salarioPorHora);

        System.out.println("Salario final: " + funcionario.salarioTotal());

    }
}

class Funcionario {
    private int horasTrabalhadas;
    private float salarioPorHoras;

    public Funcionario(int horasTrabalhadas, float salarioPorHoras) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHoras = salarioPorHoras;
    }

    public float salarioTotal()
    {
        float salario;
        if (horasTrabalhadas <= 160)
        {
            salario = horasTrabalhadas * salarioPorHoras;
        } else
        {
            salario = (160 * salarioPorHoras) + ((horasTrabalhadas - 160) * (salarioPorHoras * 1.5f));
        }
        return salario;
    }
}
