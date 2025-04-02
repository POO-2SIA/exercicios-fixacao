package Ex07;

public class Bola {
    String cor;
    double raio;

    public Bola(String cor, double raio) {
        this.cor = cor;
        this.raio = raio;
    }

    public Bola maiorBola(Bola bola1, Bola bola2) {
        Bola maior;
        if (this.raio > bola1.raio && this.raio > bola2.raio) {
            maior = new Bola(this.cor, this.raio);
        } else if (bola1.raio > this.raio && bola1.raio > bola2.raio) {
            maior = new Bola(bola1.cor, bola1.raio);
        } else {
            maior = new Bola(bola2.cor, bola2.raio);
        }
        return maior;
    }

    public String retornarDados() {
        String aux = "";
        aux += "Cor: " + this.cor;
        aux += "\nRaio: " + this.raio;
        return aux;
    }
}
