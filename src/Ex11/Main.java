package Ex11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor[] professores = new Professor[1];
        String nome, titulo;
        int numAulasSemanais;
        double valorHoraAula;

        for(int i = 0; i < professores.length; i++) {

            System.out.println("Por favor, insira o nome do professor: ");
            nome = sc.nextLine();

            System.out.println("Por favor, insira seu título: ");
            titulo = sc.nextLine();


            System.out.println("Por favor, insira o número de aulas semanais: ");
            numAulasSemanais = sc.nextInt();

            System.out.println("Por favor, insira o valor da Hora-Aula: ");
            valorHoraAula = sc.nextDouble();

            professores[i] = new Professor(nome, titulo, numAulasSemanais, valorHoraAula);
        }

        for(int i = 0; i < professores.length; i++) {
            System.out.println("----------------------");
            professores[i].CalcularSalario();
        }
    }
}
