package Ex05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.0000");
        double metros;
        Distancia distancia = new Distancia();

        System.out.println("Insira os metros: ");
        metros = sc.nextDouble();

        System.out.println("Distância em Milhas: " + dc.format(distancia.calcularMilhas(metros)));
        System.out.println("Distância em Pés: " + dc.format(distancia.calcularPes(metros)));
    }
}
