package Ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor do raio");
        Circulo c1 = new Circulo(sc.nextDouble());

        System.out.println("Perímetro: " + c1.calcularPerimetro());
        System.out.println("Área: " + c1.calcularArea());
    }
}
