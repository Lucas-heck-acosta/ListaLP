package exercicios;
import java.util.Scanner;

public class Temperaturas {
    Scanner scanner = new Scanner(System.in);

    public  static void  main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("temperatura Fahrenheit: ");
        int fahrenheit = scanner.nextInt();

        Conversor conversor = new Conversor();

        System.out.println("Temperatuda em celcius: " + conversor.converterFahrenheitParaCelcius(fahrenheit));

        scanner.close();

    }
}

class Conversor {
    public int converterFahrenheitParaCelcius(int fahrenheit)
    {
        return (fahrenheit - 32) * 5/9;
    }
}
