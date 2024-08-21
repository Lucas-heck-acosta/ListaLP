package exercicios;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("idade em anos: ");
        int anos = scanner.nextInt();
        System.out.print("idade em meses: ");
        int meses = scanner.nextInt();
        System.out.print("idade em dias: ");
        int dias = scanner.nextInt();

        Pessoa pessoa = new Pessoa(anos, meses, dias);

        System.out.println("A idade em dias é: " + pessoa.calcularIdadeEmDias());

        scanner.close();
    }
}

class Pessoa {
    private int anos;
    private int meses;
    private int dias;

    public Pessoa(int anos, int meses, int dias) {
        this.anos = anos;
        this.meses = meses;
        this.dias = dias;
    }

    public int calcularIdadeEmDias() {
        return (anos * 365) + (meses * 30) + dias;
    }
}
