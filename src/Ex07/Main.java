package Ex07;

public class Main {
    public static void main(String[] args) {
        Bola bola1 = new Bola("Azul", 2.75);
        Bola bola2 = new Bola("Branca", 3.5);
        Bola bola3 = new Bola("Vermelha", 3.25);

        Bola aux = bola1.maiorBola(bola2, bola3);
        System.out.println("Dados da bola com maior raio -> \n" + aux.retornarDados());
    }
}
