package Ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Temperatura t1 = new Temperatura();

        System.out.println("Insira a temperatura em graus celcius: ");
        t1.grausC = sc.nextDouble();

        System.out.println("Temperatura em fahrenheit: " + t1.calcularGrausF());
        System.out.println("Temperatura em kelvin: " + t1.calcularGrausK());
    }
}
