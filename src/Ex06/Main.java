package Ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hora, minutos, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as horas: ");
        hora = sc.nextInt();
        System.out.println("Insira os minutos: ");
        minutos = sc.nextInt();
        System.out.println("Insira os segundos: ");
        segundos = sc.nextInt();

        Hora hora1 = new Hora(hora, minutos, segundos);
        hora1.exibirHorario();

    }
}
