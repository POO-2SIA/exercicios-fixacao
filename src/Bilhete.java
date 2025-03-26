import java.util.Random;

public class Bilhete {
    //Por padrão, as variáveis numéricas na classe se inicializam com 0
    public double saldo;
    //Vamos inicializar a tarifaBase como uma constante de valor 5. E como não queremos que ela apareça no main
    //(não queremos que ela pertença ao objeto) delcaramos ela como static - dessa forma, o atributo não será atribuido
    //ao objeto - ele pertencerá à classe
    static final double tarifaBase = 5;
    private long numBilhete;
    Usuario usuario;

    //Construtor
    public Bilhete(Usuario usuario) {
        numBilhete = gerarNum();
        this.usuario = usuario;
    }

    private long gerarNum() {
        Random rd = new Random();
        long num = rd.nextLong(1000, 10000);
        return num;
    }

    //Método para carregar o bilhete
    public void carregarBilhete(double valor) {
        saldo += valor;
    }

    //Método para consultar o saldo
    public double consultarSaldo() {
        return saldo;
    }

    //Método para passar na catraca
    public String passarNaCatraca() {

        /*
        double tarifa = 0;
        if (usuario.perfil.equalsIgnoreCase("Comum")) {
            tarifa = tarifaBase;
        } else if (usuario.nome.equalsIgnoreCase("Estudante") || usuario.nome.equalsIgnoreCase("Professor")) {
            tarifa = tarifaBase / 2;
        }
        */

        double tarifa = tarifaBase / 2;

        if (usuario.perfil.equalsIgnoreCase("Comum")) {
            tarifa = tarifaBase;
        }

        if (saldo >= tarifa) {
            saldo -= tarifa;
            return "Catraca liberada";
        } else {
            return "Saldo insuficiente";
        }
    }

    public long getNum() {
        return numBilhete;
    }
}
