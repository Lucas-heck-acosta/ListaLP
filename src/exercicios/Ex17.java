package exercicios;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nota P1: ");
        float p1 = scanner.nextFloat();

        System.out.print("nota E1: ");
        float e1 = scanner.nextFloat();

        System.out.print("nota E2: ");
        float e2 = scanner.nextFloat();

        System.out.print("nota API: ");
        float api = scanner.nextFloat();

        System.out.print("nota SUB: ");
        float sub = scanner.nextFloat();

        System.out.print("nota X: ");
        float x = scanner.nextFloat();

        CalculadoraMedias calculadoraMedias = new CalculadoraMedias(p1, e1, e2, api, sub, x);

        System.out.println("Media final: " + calculadoraMedias.mediaFinal());

    }
}

class CalculadoraMedias {
    private float p1;
    private float e1;
    private float e2;
    private float api;
    private float sub;
    private float x;

    public CalculadoraMedias(float p1, float e1, float e2, float api, float sub, float x) {
        this.p1 = p1;
        this.e1 = e1;
        this.e2 = e2;
        this.api = api;
        this.sub = sub;
        this.x = x;
    }

    public double mediaFinal()
    {
        double parcial = (p1*0.6+((e1+e2)/2)*0.4);
        double notaFinal = parcial *0.5+(Math.max((parcial -5.9),0)/(parcial -5.9))*(api*0.5)+x+(sub*0.2);
        return  notaFinal;
    }
}
