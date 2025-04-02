package Ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Insira o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Insira o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Insira o valor de c: ");
        c = sc.nextDouble();

        EquacaoSegundoGrau e1 = new EquacaoSegundoGrau(a, b, c);
        if (e1.calcularDelta() > 0) {
            e1.calcularX();
            e1.exibirRaizes();
        }

    }
}
