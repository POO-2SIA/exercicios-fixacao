package Ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bicicleta bicicleta1 = new Bicicleta("Azul", 5, 250);
        Bicicleta bicicleta2 = new Bicicleta("Verde", 10, 550.35);
        bicicleta1.exibirInfos();
        System.out.println("--------------------------------");
        bicicleta2.exibirInfos();


    }
}
