package Ex13;

public class Main {
    public static void main(String[] args) {
        Exercicio e1 = new Exercicio(1, 2, 3);
        Exercicio e2 = new Exercicio(4, 1, 0);

        e1.x = e1.z + e2.x + e2.y + Exercicio.a;
        System.out.println(e1.x);


    }
}
