package Ex15;

public class Exercicio {
    static int valor = 7;

    public static void main(String[] args) {
        new Exercicio().fazerAlgo(valor);
        System.out.print(" " + valor);
    }

    public void fazerAlgo(int valor) {
        valor++;
        for(int aux = 3; aux < 6; aux++) {
            System.out.print(" " + valor);
        }
    }
}
