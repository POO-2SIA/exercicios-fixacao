package Ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Insira o valor de a: ");
        a = sc.nextInt();

        System.out.println("Insira o valor de b: ");
        b = sc.nextInt();

        System.out.println("Insira o valor de c: ");
        c = sc.nextInt();

        Triangulo t1 = new Triangulo(a, b, c);

        if(t1.validarTriangulo()) {
            System.out.println("Área do triângulo: " + t1.calcularArea());
            System.out.println("Perímetro do triângulo: " + t1.calcularPerimetro());
            System.out.println("Centróide x: " + t1.calcularCentroideX());
            System.out.println("Centróide y: " + t1.calcularCentroideY());
        } else {
            System.out.println("Triângulo inválido!");
        }
    }
}
