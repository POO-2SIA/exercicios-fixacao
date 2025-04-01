package Ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r1 = new Retangulo();

        System.out.println("Insira o valor da base do retângulo: ");
        r1.base = sc.nextDouble();

        System.out.println("Insira o valor da altura do retângulo: ");
        r1.altura = sc.nextDouble();

        if (r1.altura == r1.base) {
            System.out.println("O retângulo possui lados iguais");
        }

        System.out.println("Área: " + r1.calcularArea() + " unidades quadradas");
        System.out.println("Perímetro: " + r1.calcularPerimetro() + " unidades");
    }
}
