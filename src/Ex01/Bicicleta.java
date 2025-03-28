package Ex01;

import java.text.DecimalFormat;

public class Bicicleta {
    public String cor;
    public int numMarchas;
    public double valor;

    public Bicicleta(String cor, int numMarchas, double valor) {
        this.cor = cor;
        this.numMarchas = numMarchas;
        this.valor = valor;
    }

    public void exibirInfos() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Cor: " + this.cor);
        System.out.println("Num Marchas: " + this.numMarchas);
        System.out.println("Valor: R$" + df.format(this.valor));
    }
}
